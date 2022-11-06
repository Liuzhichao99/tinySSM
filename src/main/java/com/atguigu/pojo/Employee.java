package com.atguigu.pojo;


public class Employee {

    private Integer empId;

    private String empName;

    private Integer age;

    private Integer gender;

    private String email;

    public Employee(Integer empId, String empName, Integer age, Integer gender, String email) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "empId=" + empId +
               ", empName='" + empName + '\'' +
               ", age=" + age +
               ", gender=" + gender +
               ", email='" + email + '\'' +
               '}';
    }
}
