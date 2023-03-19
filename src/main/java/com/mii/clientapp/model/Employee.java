package com.mii.clientapp.model;

import java.time.LocalDate;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Employee manager;
    private String gender;
    private LocalDate birthdate;
    private String address;
    private String email;
    private String phone;
}
