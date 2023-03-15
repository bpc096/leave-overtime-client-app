package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.Leave;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LeaveService {

    private RestTemplate restTemplate;

    public List<Leave> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/leave", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Leave>>() {
                }).getBody();
    }

    public Leave getById(int id) {
        return restTemplate.exchange("http://localhost:8088/api/leave/" + id, HttpMethod.GET, null,
                new ParameterizedTypeReference<Leave>() {
                }).getBody();
    }

    public Leave create(Leave leave) {
        return restTemplate.exchange("http://localhost:8088/api/leave",
                HttpMethod.POST,
                new HttpEntity<>(leave),
                new ParameterizedTypeReference<Leave>() {
                }).getBody();
    }

    public Leave update(int id, Leave leave) {
        return restTemplate.exchange("http://localhost:8088/api/leave/" + id,
                HttpMethod.PUT,
                new HttpEntity<>(leave),
                new ParameterizedTypeReference<Leave>() {
                }).getBody();
    }

    public Leave delete(int id) {
        return restTemplate.exchange("http://localhost:8088/api/leave/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<Leave>() {
                }).getBody();
    }

}
