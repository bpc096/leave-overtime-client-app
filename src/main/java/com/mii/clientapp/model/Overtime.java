package com.mii.clientapp.model;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Overtime {

    private Integer id;
    private String startTime;
    private String endTime;
    private String applydate;
    private String purpose;
    private String updateby;
    private String respontime;
    private Employee employee;
    private Status status;
    private Project project;
    private List<OvertimeHistory> overtimeHistories;

}
