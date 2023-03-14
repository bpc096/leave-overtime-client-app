package com.mii.clientapp.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private Boolean isEnabled = false;
    private Boolean isAccountNonLocked = true;
    private Integer quota = 12;
    private Employee employee;
}
