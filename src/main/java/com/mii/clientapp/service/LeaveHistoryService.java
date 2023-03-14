package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.Leave;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LeaveHistoryService {
    
    private RestTemplate restTemplate;


    public List<Leave> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/leavehistory", HttpMethod.GET, null,
            new ParameterizedTypeReference<List<Leave>>() {
            }).getBody();
    }
    
}
