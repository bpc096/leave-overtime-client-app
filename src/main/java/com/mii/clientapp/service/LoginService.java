package com.mii.clientapp.service;

import com.mii.clientapp.model.dto.LoginRequest;
import com.mii.clientapp.model.dto.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoginService {
    // private RestTemplate restTemplate;

    // @Value("${server.baseUrl}/login")
    // private String url;

    // @Autowired
    // public LoginService(RestTemplate restTemplate) {
    // this.restTemplate = restTemplate;
    // }

    // public Boolean login(LoginRequest loginRequest) {
    // ResponseEntity<LoginResponse> response = restTemplate.exchange(
    // url,
    // HttpMethod.POST,
    // new HttpEntity(loginRequest),
    // new ParameterizedTypeReference<LoginResponse>() {
    // });
    // if (response.getStatusCode() == HttpStatus.OK) {
    // setAuthorization(response.getBody(), loginRequest.getPassword());
    // return true;
    // }
    // return false;
    // }

    // // SetAuthorization
    // public void setAuthorization(LoginResponse res, String pass) {
    // List<SimpleGrantedAuthority> authority = res.getAuthorities()
    // .stream()
    // .map(authorize -> new SimpleGrantedAuthority(authorize))
    // .collect(Collectors.toList());
    // UsernamePasswordAuthenticationToken authToken = new
    // UsernamePasswordAuthenticationToken(res.getUsername(), pass,
    // authority);
    // SecurityContextHolder.getContext().setAuthentication(authToken);

    // }
}
