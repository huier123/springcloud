package com.example.springcloudeureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka02Application.class, args);
    }

}
