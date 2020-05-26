package com.mamba.cloud.consumer.controller;

import com.mamba.cloud.consumer.feign.DemoFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoConsumerController {

    @Value("${spring.application.name}")
    private String name;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/ask")
    public String ask() {
        return restTemplate.getForEntity("http://mamba-demo-provider-service/hello/{name}", String.class, name).getBody();
    }

    @Autowired
    private DemoFeignClients feignClients;

    @GetMapping("/sayHello/{name}")
    public String askName(@PathVariable("name") String name) {
        return feignClients.sayHello(name);
    }
}
