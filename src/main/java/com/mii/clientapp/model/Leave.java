package com.mii.clientapp.model;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {

    private String startday;
    private String endday;
    private String applydate; 
    private String updateby;
    private String reason;
    private String respontime;
    private Employee employee;
    private Status status;
    private List<LeaveHistory> leavesHistories;

}
