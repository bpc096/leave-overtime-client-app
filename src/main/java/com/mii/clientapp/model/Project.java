package com.mii.clientapp.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Integer id;
    private String name;
    private Integer overtimeBudget;
}
