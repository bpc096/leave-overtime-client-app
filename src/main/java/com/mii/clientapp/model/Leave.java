package com.mii.clientapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {
    
    private Integer id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startday;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endday;
    // @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime applydate;
    private String updateby;
    private String reason;
    // @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime respontime;
    private Employee employee;
    private Status status;
    private LeaveHistory leavesHistories;

    // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy
    // HH:mm:ss");
}
