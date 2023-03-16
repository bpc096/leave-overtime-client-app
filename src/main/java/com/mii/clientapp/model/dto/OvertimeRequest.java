package com.mii.clientapp.model.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import com.mii.clientapp.model.Employee;
import com.mii.clientapp.model.Project;
import com.mii.clientapp.model.Status;
import lombok.Data;

@Data
public class OvertimeRequest {
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
