package com.denisselitsky.mvc_hibernate_aop.services;

import com.denisselitsky.mvc_hibernate_aop.entity.Department;
import com.denisselitsky.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    public Department getDepartment(int id);
}
