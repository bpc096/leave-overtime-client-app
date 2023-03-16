package com.mii.clientapp.model;

import java.time.LocalDate;
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
    private Integer id;
    private LocalDate startday;
    private LocalDate endday;
    private LocalDateTime applydate;
    private String updateby;
    private String reason;
    private LocalDateTime respontime;
    private Employee employee;
    private Status status;
    private List<LeaveHistory> leavesHistories;

    // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy
    // HH:mm:ss");
}
