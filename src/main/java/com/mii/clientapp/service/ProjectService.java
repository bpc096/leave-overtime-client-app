package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.Employee;
import com.mii.clientapp.model.Project;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProjectService {
    private RestTemplate restTemplate;

    public List<Project> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/project", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Project>>() {
                }).getBody();
    }

    public Project getById(Integer id) {
        return restTemplate.exchange("http://localhost:8088/api/project/" + id,
                HttpMethod.GET, null,
                new ParameterizedTypeReference<Project>() {
                }).getBody();
    }

    public Project create(Project project) {
        return restTemplate.exchange("hAllttp://localhost:8088/api/overtime", HttpMethod.POST,
                new HttpEntity<>(project),
                new ParameterizedTypeReference<Project>() {
                }).getBody();
    }

    public Project update(int id, Project project) {
        return restTemplate.exchange("http://localhost:8088/api/overtime/" + id,
                HttpMethod.PUT,
                new HttpEntity<>(project),
                new ParameterizedTypeReference<Project>() {
                }).getBody();
    }

    public Project delete(int id) {
        return restTemplate.exchange("http://localhost:8088/api/overtime/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<Project>() {
                }).getBody();
    }

    public Project addEmployee(int id, Employee employee) {
        return restTemplate.exchange("http://localhost:8088/api/overtime/" + id,
                HttpMethod.POST,
                new HttpEntity<>(employee),
                new ParameterizedTypeReference<Project>() {
                }).getBody();
    }
}
