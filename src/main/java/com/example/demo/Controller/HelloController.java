package com.example.demo.Controller;

import com.example.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/apple")
    public String hello(){
        return "hello world" ;
    }

    @GetMapping("/peach")
    public String hello2(){
        return helloService.helloservice();
    }


}

