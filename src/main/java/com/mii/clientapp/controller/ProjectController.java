package com.mii.clientapp.controller;

import com.mii.clientapp.model.Employee;
import com.mii.clientapp.model.Project;
import com.mii.clientapp.service.EmployeeService;
import com.mii.clientapp.service.ProjectService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectController {
    
    private ProjectService projectService;
    private EmployeeService employeeService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("projects", projectService.getAll());
        return "layouts/project/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model, Project project) {
        List<Employee> lemp = employeeService.getAll();
        model.addAttribute("status", "create");
        model.addAttribute("title", "Create Project");
        model.addAttribute("listEmployees", lemp);
        return "layouts/project/form";
    }

    @PostMapping
    public String create(Project project) {
        projectService.create(project);
        return "redirect:/project";
    }

    @GetMapping("/update-form/{id}")
    public String updateForm(Model model, @PathVariable int id) {
        model.addAttribute("project", projectService.getById(id));
        model.addAttribute("status", "update");
        model.addAttribute("title", "Update project");
        return "layouts/project/form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, Project project) {
        projectService.update(id, project);
        return "redirect:/project";
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Integer id, Project project) {
        projectService.delete(id);
        return "redirect:/project";
    }

    @PostMapping(value = "/{id}")
    public String addEmployee(@PathVariable Integer id, Employee employee) {
        projectService.addEmployee(id, employee);
        return "redirect:/project";
    }
}
