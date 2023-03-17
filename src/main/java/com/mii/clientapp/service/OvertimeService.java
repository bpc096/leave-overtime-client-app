package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.Overtime;
import com.mii.clientapp.model.dto.OvertimeRequest;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OvertimeService {

    private RestTemplate restTemplate;

    public List<Overtime> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/overtime", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Overtime>>() {
                }).getBody();
    }

    public Overtime getById(int id) {
        return restTemplate.exchange("http://localhost:8088/api/overtime/" + id, HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Overtime>() {
                }).getBody();
    }

    public Overtime create(Overtime overtime) {
        return restTemplate.exchange("http://localhost:8088/api/overtime", HttpMethod.POST,
                new HttpEntity<>(overtime),
                new ParameterizedTypeReference<Overtime>() {
                }).getBody();
    }

    public Overtime update(int id, Overtime overtime) {
        return restTemplate.exchange("http://localhost:8088/api/overtime/" + id,
                HttpMethod.PUT,
                new HttpEntity<>(overtime),
                new ParameterizedTypeReference<Overtime>() {
                }).getBody();
    }

    public Overtime delete(int id) {
        return restTemplate.exchange("http://localhost:8088/api/overtime/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<Overtime>() {
                }).getBody();
    }
}
