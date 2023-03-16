package com.mii.clientapp.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Overtime {
    private Integer id;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDateTime applydate;
    private String purpose;
    private String updateby;
    private LocalDateTime respontime;
    private Employee employee;
    private Status status;
    private Project project;

}
