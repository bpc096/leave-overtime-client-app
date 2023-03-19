package com.mii.clientapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mii.clientapp.model.Project;
import com.mii.clientapp.model.dto.OvertimeRequest;
import com.mii.clientapp.service.OvertimeService;
import com.mii.clientapp.service.ProjectService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/overtime")
@AllArgsConstructor
public class OvertimeController {

    private OvertimeService overtimeService;
    private ProjectService projectService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("overtimes", overtimeService.getAll());
        return "layouts/overtime/index";
    }

    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable int id) {
        model.addAttribute("overtime", overtimeService.getById(id));
        return "layouts/overtime/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model, OvertimeRequest overtimes) {
        List<Project> projects = projectService.getAll();
        model.addAttribute("listProjects", projects);
        model.addAttribute("status", "create");
        model.addAttribute("title", "Create overtime");
        return "layouts/overtime/form";
    }

    @PostMapping
    public String create(OvertimeRequest overtime) {
        overtimeService.create(overtime);
        return "redirect:/overtime";
    }

    @GetMapping("/update-form/{id}")
    public String updateForm(Model model, @PathVariable int id) {
        List<Project> projects = projectService.getAll();
        model.addAttribute("listProjects", projects);
        model.addAttribute("overtime", overtimeService.getById(id));
        model.addAttribute("status", "update");
        // model.addAttribute("project", "update");
        model.addAttribute("title", "Update overtime");
        return "layouts/user/form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, OvertimeRequest overtime) {
        overtimeService.update(id, overtime);
        return "redirect:/overtime";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        overtimeService.delete(id);
        return "redirect:/overtime";
    }
}
