package com.example.springcloudpoducerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringcloudPoducerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPoducerHystrixDashboardApplication.class, args);
    }

}
