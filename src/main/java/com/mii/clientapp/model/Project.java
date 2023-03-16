package com.mii.clientapp.model;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Integer id;
    private String name;
    private Integer overtimeBudget;
    private List<Employee> employees;
    private List<Overtime> overtime;
}
