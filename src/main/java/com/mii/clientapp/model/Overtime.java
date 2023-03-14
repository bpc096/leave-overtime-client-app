package com.mii.clientapp.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Overtime {

    private Integer id;
    private LocalDateTime startTime;
    private LocalTime endTime;
    private String purpose;
    private String updateby;
    private LocalDateTime respontime;
    
}
