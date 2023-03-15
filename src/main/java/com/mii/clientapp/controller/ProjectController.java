package com.mii.clientapp.controller;

import com.mii.clientapp.model.Project;
import com.mii.clientapp.service.ProjectService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class ProjectController {
    private ProjectService projectService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("countries", projectService.getAll());
        return "project/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model, Project project) {
        model.addAttribute("status", "create");
        model.addAttribute("title", "Create Project");
        return "project/form";
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
        return "project/form";
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
}
