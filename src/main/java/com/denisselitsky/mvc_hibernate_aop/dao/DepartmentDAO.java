package com.denisselitsky.mvc_hibernate_aop.dao;

import com.denisselitsky.mvc_hibernate_aop.entity.Department;
import java.util.List;

public interface DepartmentDAO {
    public List<Department> getAllDepartment();

    public Department getDepartment(int id);
}
