package com.mii.clientapp.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Overtime {
    private Integer id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime startTime;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime endTime;
    // @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime applydate;
    private String purpose;
    private String updateby;
    // @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime respontime;
    private Employee employee;
    private Status status;
    private Project project;

}
