package com.mii.clientapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.*;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

// import com.mii.clientapp.util.RequestInterceptor;

@Configuration
public class RestTemplateConfig {

    @Bean 
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    // @Bean
    // public RestTemplate restTemplate() {
    //     RestTemplate restTemplate = new RestTemplate();

    //     List<ClientHttpRequestInterceptor> interceptors =
    //     restTemplate.getInterceptors();

    //     if (CollectionUtils.isEmpty(interceptors)) {
    //         interceptors = new ArrayList<>();
    //     }
    //     interceptors.add(new RequestInterceptor());
    //     restTemplate.setInterceptors(interceptors);
    //     return restTemplate;
    // }

}
