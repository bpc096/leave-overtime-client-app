package com.mii.clientapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;



import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {
    
private Integer id;
private LocalDate startday;
private LocalDate endday;
private LocalDateTime applydate;
private String updateby;
private String reason;
private LocalDateTime respontime;

}
