package com.mii.clientapp.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {

    private String startday;
    private String endday;
    private String applydate;
    private String updateby;
    private String reason;
    private LocalDateTime respontime;
    private Employee employee;
    private Status status;
    private List<LeaveHistory> leavesHistories;

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
}
