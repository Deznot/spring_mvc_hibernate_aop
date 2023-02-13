package com.denisselitsky.mvc_hibernate_aop.dao;

import com.denisselitsky.mvc_hibernate_aop.entity.Department;
import com.denisselitsky.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
    private final SessionFactory sessionFactory;

    public DepartmentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Department> getAllDepartment(){
        Session session = sessionFactory.getCurrentSession();
        Query<Department> query = session.createQuery("from Department", Department.class);
        List<Department> allDepartments = query.getResultList() ;
        return allDepartments;
    };

    public Department getDepartment(int id) {
        Session session = sessionFactory.getCurrentSession();
        Department department = session.get(Department.class, id);
        return department;
    }

}
