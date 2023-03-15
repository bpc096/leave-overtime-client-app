package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mii.clientapp.model.Employee;
import com.mii.clientapp.service.EmployeeService;
import com.mii.clientapp.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    
    private EmployeeService employeeService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "layouts/employee/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model, Employee employee) {
        model.addAttribute("status", "create");
        model.addAttribute("title", "Create Employee");
        return "layouts/employee/form";
    }

    @PostMapping
    public String create(Employee employee) {
        employeeService.create(employee);
        return "redirect:/employee";
    }
}
