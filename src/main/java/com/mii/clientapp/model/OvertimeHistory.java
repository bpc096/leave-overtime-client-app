package com.mii.clientapp.model;

import java.time.LocalDateTime;
import java.time.LocalTime;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OvertimeHistory {
    
    private Integer id;

    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDateTime applydate;
    private String purpose;
    private String updateby;
    private LocalDateTime respontime;
    private String employee;
    private String status;
    private String project;
    private Overtime overtime;

}
