package com.example.springcloudconsumer.service.impl;

import com.example.springcloudconsumer.feign.TestFeign;
import com.example.springcloudconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestFeign testFeign;

    @Override
    public String testService() {
        return testFeign.producerTestControllerTest();
    }
}
