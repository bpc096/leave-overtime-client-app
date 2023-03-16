package com.mii.clientapp.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Integer idmanager;
    private String gender;
    private LocalDate birthdate;
    private String address;
    private String email;
    private String phone;
    // private Employee employee;
}
