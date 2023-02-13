package com.denisselitsky.mvc_hibernate_aop.entity.dto;

import com.denisselitsky.mvc_hibernate_aop.entity.Department;
import com.denisselitsky.mvc_hibernate_aop.entity.Employee;

import java.util.List;


public class CreateEmployeeDTO {
    private Employee employee;
    private List<Department> departments;

    public  CreateEmployeeDTO() {};
    public CreateEmployeeDTO(List<Department> departments) {
        this.departments = departments;
    }

    public CreateEmployeeDTO(Employee employee, List<Department> departments) {
        this.departments = departments;
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "CreateEmployeeDTO{" +
                "employee=" + employee +
                ", departments=" + departments +
                '}';
    }
}
