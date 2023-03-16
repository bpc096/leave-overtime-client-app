package com.mii.clientapp.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mii.clientapp.model.Employee;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
    
    private RestTemplate restTemplate;


    public List<Employee> getAll() {
        return restTemplate.exchange("http://localhost:8088/api/employee", HttpMethod.GET, null,
            new ParameterizedTypeReference<List<Employee>>() {
            }).getBody();
    }

    public Employee getById(int id) {
        return restTemplate.exchange("http://localhost:8088/api/employee/" + id, HttpMethod.GET,
        null,
        new ParameterizedTypeReference<Employee>() {
        }).getBody();
    }

    public Employee create(Employee employee){
        return restTemplate.exchange("http://localhost:8088/api/employee", HttpMethod.POST,
        new HttpEntity<>(employee),
        new ParameterizedTypeReference<Employee>(){  
        }).getBody();
    }

    public Employee update(int id, Employee employee) {
        return restTemplate.exchange("http://localhost:8088/api/employee/" + id,
        HttpMethod.PUT,
        new HttpEntity<>(employee),
        new ParameterizedTypeReference<Employee>(){
        }).getBody();
    }

    public Employee delete(int id){
        return restTemplate.exchange("http://localhost:8088/api/employee/" + id,
        HttpMethod.DELETE,
        null,
        new ParameterizedTypeReference<Employee>(){
        }).getBody();
    }
}
