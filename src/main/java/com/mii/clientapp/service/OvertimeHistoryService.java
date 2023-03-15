package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OvertimeHistoryService {
    
    private RestTemplate restTemplate;

    public List<OvertimeHistoryService> getAll(){
        return restTemplate.exchange("http://localhost:8088/api/overtimehistory", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<OvertimeHistoryService>>() {
                }).getBody();
    }
}
