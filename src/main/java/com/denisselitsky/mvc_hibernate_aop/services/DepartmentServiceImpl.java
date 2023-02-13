package com.denisselitsky.mvc_hibernate_aop.services;

import com.denisselitsky.mvc_hibernate_aop.dao.DepartmentDAO;
import com.denisselitsky.mvc_hibernate_aop.entity.Department;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentDAO departmentDAO;
    DepartmentServiceImpl(DepartmentDAO departmentDAO){
        this.departmentDAO = departmentDAO;
    }

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartment();
    }

    @Override
    @Transactional
    public Department getDepartment(int id) {
        return departmentDAO.getDepartment(id);
    }
}
