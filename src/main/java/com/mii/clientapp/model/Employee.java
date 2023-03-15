package com.mii.clientapp.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Integer idmanager;
    private String gender;
    private String birthdate;
    private String address;
    private String email;
    private String phone;
}
