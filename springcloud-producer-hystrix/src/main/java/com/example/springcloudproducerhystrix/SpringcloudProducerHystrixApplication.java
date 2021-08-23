package com.example.springcloudproducerhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class SpringcloudProducerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducerHystrixApplication.class, args);
    }

}
