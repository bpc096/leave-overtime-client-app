package com.mii.clientapp;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaveOvertimeClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveOvertimeClientAppApplication.class, args);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println("Client App is Running...");
	}

}
