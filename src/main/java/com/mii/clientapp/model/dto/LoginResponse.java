package com.mii.clientapp.model.dto;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String username;
    private String email;
    private List<String> authorities;
}
