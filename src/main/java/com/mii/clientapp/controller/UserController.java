package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mii.clientapp.model.User;
import com.mii.clientapp.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("users", userService.getAll());
        return "layouts/user/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model, User users) {
        model.addAttribute("status", "create");
        model.addAttribute("title", "Create Employee");
        return "layouts/user/form";
    }

    @PostMapping
    public String create(User user) {
        userService.create(user);
        return "redirect:/user";
    }

    // @GetMapping("/update-form/{id}")
    // public String updateForm(Model model, @PathVariable int id) {
    // model.addAttribute("employee", employeeService.getById(id));
    // model.addAttribute("status", "update");
    // model.addAttribute("title", "Update Employee");
    // return "employee/form";
    // }

    // @PutMapping("/{id}")
    // public String update(@PathVariable int id, Employee employee) {
    // employeeService.update(id, employee);
    // return "redirect:/user";
    // }

    // @DeleteMapping("/{id}")
    // public String delete(@PathVariable int id) {
    // employeeService.delete(id);
    // return "redirect:/user";
    // }

}
