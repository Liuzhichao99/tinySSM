package com.atguigu.controller;

import com.atguigu.pojo.Employee;
import com.atguigu.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Date:2022/10/22
 * Author:lzc
 * Description:
 * 查询员工的分页信息-->/employee/page/1-->get
 * 查询所有的员工信息-->/employee-->get
 * 根据id查询员工信息-->/employee/1-->get
 * 添加员工信息-->/employee-->post
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String findEmployeePage(@PathVariable Integer pageNum, Model model) {
        //调用service处理业务逻辑
        PageInfo<Employee> page = employeeService.findEmployeePage(pageNum);
        //将封装了分页信息的对象page共享到请求域中
        model.addAttribute("page",page);
        //跳转到employee_list.html
        return "employee_list";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String findAllEmployee(Model model) {
        //调用service处理业务逻辑
        List<Employee> employeeList = employeeService.findAllEmployee();
        int total = employeeList.size();
        //将所有的员工信息在请求域中共享
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("total", total);
        //跳转到employee_list.html
        return "employee_all";
    }

    @RequestMapping(value = "/employee_toAdd", method = RequestMethod.GET)
    public String toAddEmployee(Model model) {
        return "employee_add";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee, Model model) {
        System.out.println(employee);
        int flag = employeeService.addEmployee(employee);
        if (flag == 1) {
            return "redirect:/employee";
        }
        model.addAttribute("flag", !false);//添加失败
        return "employee_add";
    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable Integer empId, Model model) {
        employeeService.deleteEmployee(empId);

        return "redirect:/employee/page/1";

//        model.addAttribute("flag", !false);//添加失败

    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
    public String employee_toUpdate(@PathVariable Integer empId, Model model) {
        Employee employee = employeeService.queryEmployeeById(empId);
        System.out.println(employee);
        model.addAttribute(employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee(Employee employee, Model model) {
        System.out.println(employee);
        employeeService.updateEmployee(employee);

        return "redirect://employee/page/1";
    }




}
