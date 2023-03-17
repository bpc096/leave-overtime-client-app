package com.mii.clientapp.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class LeaveRequest {
    private LocalDate startday;
    private LocalDate endday;
    private LocalDateTime applydate;
    private String updateby;
    private String reason;
    private LocalDateTime respontime;
    private Integer employeeId;
    private Integer statusId;
}
