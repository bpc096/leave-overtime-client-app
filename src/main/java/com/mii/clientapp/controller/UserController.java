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

    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable int id) {
        model.addAttribute("emp", userService.getById(id));
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

    @GetMapping("/update-form/{id}")
    public String updateForm(Model model, @PathVariable int id) {
        model.addAttribute("user", userService.getById(id));
        model.addAttribute("status", "update");
        model.addAttribute("title", "Update Employee");
        return "layouts/user/form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, User user) {
        userService.update(id, user);
        return "redirect:/user";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        userService.delete(id);
        return "redirect:/user";
    }

}
