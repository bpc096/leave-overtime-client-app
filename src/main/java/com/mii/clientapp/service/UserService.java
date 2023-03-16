package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.User;
import com.mii.clientapp.model.dto.UserRequest;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private RestTemplate restTemplate;

    public List<User> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/user", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<User>>() {
                }).getBody();
    }

    public User getById(int id) {
        return restTemplate.exchange("http://localhost:8088/api/user/" + id, HttpMethod.GET, null,
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User create(User user) {
        return restTemplate.exchange("http://localhost:8088/api/user",
                HttpMethod.POST,
                new HttpEntity<>(user),
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User update(int id, User user) {
        return restTemplate.exchange("http://localhost:8088/api/user/" + id,
                HttpMethod.PUT,
                new HttpEntity<>(user),
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User delete(int id) {
        return restTemplate.exchange("http://localhost:8088/api/user/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

}
