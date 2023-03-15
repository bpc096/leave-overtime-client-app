package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String dashboard(Model model) {
        // model.addAttribute("name", "Roland");
        return "layouts/home";
    }
}
