package com.example.springbootweb.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 请求处理类
@RestController
public class ControllerTest {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "hello world";
    }
}
