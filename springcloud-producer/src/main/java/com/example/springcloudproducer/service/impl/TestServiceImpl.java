package com.example.springcloudproducer.service.impl;

import com.example.springcloudproducer.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String testService() {
        return "Hello Word;";
    }
}
