package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mii.clientapp.service.LeaveHistoryService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/leave_history")
@AllArgsConstructor
public class LeaveHistoryController {

    private LeaveHistoryService leaveHistoryService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("leaves_history", leaveHistoryService.getAll());
        return "layouts/leave_history/index";
    }

}
