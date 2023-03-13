package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// import org.springframework.security.core.Authentication;

import com.mii.clientapp.model.dto.LoginRequest;
import com.mii.clientapp.service.LoginService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

    private LoginService loginService;

    // @GetMapping
    // public String loginPage(LoginRequest loginRequest){
    // Authentication authentication =
    // SecurityContextHolder.getContext().getAuthentication();
    // System.out.println(authentication);
    // if (authentication == null || authentication instanceof
    // AnonymousAuthenticationToken){
    // return "auth/login";
    // }
    // return "redirect:/home";
    // }

    // @PostMapping
    // public String login(LoginRequest loginRequest){
    // if (!loginService.login(loginRequest)){
    // return "redirect:/login?error=true";
    // }
    // return "redirect:/home";
    // }

}