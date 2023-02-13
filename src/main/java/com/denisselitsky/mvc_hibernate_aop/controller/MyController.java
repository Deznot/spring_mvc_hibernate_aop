package com.denisselitsky.mvc_hibernate_aop.controller;

import com.denisselitsky.mvc_hibernate_aop.entity.Department;
import com.denisselitsky.mvc_hibernate_aop.entity.Employee;
import com.denisselitsky.mvc_hibernate_aop.entity.dto.CreateEmployeeDTO;
import com.denisselitsky.mvc_hibernate_aop.services.DepartmentService;
import com.denisselitsky.mvc_hibernate_aop.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    public MyController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    };

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        List<Department> allDepartments = departmentService.getAllDepartments();
        CreateEmployeeDTO createEmployeeDTO = new CreateEmployeeDTO(allDepartments);
        model.addAttribute("createEmployeeDTO", createEmployeeDTO);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("createEmployeeDTO") CreateEmployeeDTO createEmployeeDTO) {
        createEmployeeDTO.getEmployee().setDepartment(departmentService.getDepartment(createEmployeeDTO.getEmployee().getDepartment().getId()));
        employeeService.saveEmployee(createEmployeeDTO.getEmployee());
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id,Model model) {
        List<Department> allDepartments = departmentService.getAllDepartments();
        Employee employee = employeeService.getEmployee(id);
        CreateEmployeeDTO createEmployeeDTO = new CreateEmployeeDTO(employee,allDepartments);
        model.addAttribute("createEmployeeDTO", createEmployeeDTO);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

}
