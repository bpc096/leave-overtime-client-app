package com.mii.clientapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaveHostory {
    
    private Integer id;
    private LocalDate startday;
    private LocalDate endday;
    private LocalDateTime applydate;
    private String updateby;
    private String reason;
    private LocalDateTime respontime;
}
