package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.Status;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StatusService {

    private RestTemplate restTemplate;

    public List<Status> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/Status", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Status>>() {
                }).getBody();
    }

    public Status getById(int id) {
        return restTemplate.exchange("http://localhost:8088/api/Status/" + id, HttpMethod.GET, null,
                new ParameterizedTypeReference<Status>() {
                }).getBody();
    }

    public Status create(Status Status) {
        return restTemplate.exchange("http://localhost:8088/api/Status",
                HttpMethod.POST,
                new HttpEntity<>(Status),
                new ParameterizedTypeReference<Status>() {
                }).getBody();
    }

    public Status update(int id, Status Status) {
        return restTemplate.exchange("http://localhost:8088/api/Status/" + id,
                HttpMethod.PUT,
                new HttpEntity<>(Status),
                new ParameterizedTypeReference<Status>() {
                }).getBody();
    }

    public Status delete(int id) {
        return restTemplate.exchange("http://localhost:8088/api/Status/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<Status>() {
                }).getBody();
    }

}
