package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mii.clientapp.model.Leave;
import com.mii.clientapp.service.LeaveService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/leave")
@AllArgsConstructor
public class LeaveController {
    private LeaveService leaveService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("leaves", leaveService.getAll());
        return "layouts/leave/index";
    }

    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable int id) {
        model.addAttribute("leave", leaveService.getById(id));
        return "layouts/leave/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model, Leave leaves) {
        model.addAttribute("status", "create");
        model.addAttribute("title", "Create Leave");
        return "layouts/leave/form";
    }

    @PostMapping
    public String create(Leave leave) {
        leaveService.create(leave);
        return "redirect:/leave";
    }

    @GetMapping("/update-form/{id}")
    public String updateForm(Model model, @PathVariable int id) {
        model.addAttribute("user", leaveService.getById(id));
        model.addAttribute("status", "update");
        model.addAttribute("title", "Update Leave");
        return "layouts/user/form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, Leave leave) {
        leaveService.update(id, leave);
        return "redirect:/leave";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        leaveService.delete(id);
        return "redirect:/leave";
    }
}
