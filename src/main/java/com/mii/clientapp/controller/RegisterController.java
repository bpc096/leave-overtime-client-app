package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mii.clientapp.model.dto.UserRequest;
import com.mii.clientapp.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/register")
@AllArgsConstructor
public class RegisterController {

    private UserService userService;

    @GetMapping
    public String registerPage(Model model, UserRequest users) {
        model.addAttribute("title", "Register");
        return "layouts/auth/register";
    }

    @PostMapping
    public String create(UserRequest user) {
        userService.register(user);
        return "redirect:/user";
    }

}
