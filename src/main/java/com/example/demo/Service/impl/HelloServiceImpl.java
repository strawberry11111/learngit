package com.example.demo.Service.impl;

import com.example.demo.Service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloservice() {
        return "hello2";
    }
}
