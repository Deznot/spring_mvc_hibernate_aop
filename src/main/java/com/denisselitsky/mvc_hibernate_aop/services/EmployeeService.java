package com.denisselitsky.mvc_hibernate_aop.services;

import com.denisselitsky.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}
