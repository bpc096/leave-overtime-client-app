package com.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mii.clientapp.service.OvertimeHistoryService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/overtime_history")
@AllArgsConstructor
public class OvertimeHistoryController {

    private OvertimeHistoryService overtimeHistoryService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("overtimes_history", overtimeHistoryService.getAll());
        return "layouts/overtime_history/index";
    }

}
