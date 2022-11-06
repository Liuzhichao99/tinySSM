package com.atguigu.service.impl;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import com.atguigu.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> findAllEmployee() {
        return employeeMapper.findAllEmployee();
    }

    public PageInfo<Employee> findEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 4);
        //查询所有的员工信息
        List<Employee> list = employeeMapper.findAllEmployee();
        //获取封装了分页信息的PageInfo对象
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployee(Integer empId) {
        return employeeMapper.deleteEmployee(empId);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public Employee queryEmployeeById(Integer empId) {
        return employeeMapper.queryEmployeeById(empId);
    }
}
