package com.mii.clientapp.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Token {
    private Integer id;
    private String token;
    private LocalDateTime created;
    private LocalDateTime expired;
    private LocalDateTime confirmed;
}
