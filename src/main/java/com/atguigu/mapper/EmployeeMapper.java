package com.atguigu.mapper;

import com.atguigu.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> findAllEmployee();

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * 删除员工信息
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
     * 通过id查询员工信息
     * @param empId
     * @return
     */
    Employee queryEmployeeById(Integer empId);
}
