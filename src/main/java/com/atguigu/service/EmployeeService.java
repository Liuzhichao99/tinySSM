package com.atguigu.service;

import com.atguigu.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> findAllEmployee();

    /**
     * 查询员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> findEmployeePage(Integer pageNum);

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * 删除公共信息
     * @param empId
     * @return
     */
    int deleteEmployee(Integer empId);

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    int updateEmployee(Employee employee);

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Employee queryEmployeeById(Integer empId);

}
