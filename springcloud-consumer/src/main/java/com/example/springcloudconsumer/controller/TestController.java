package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.testService();
    }
}
