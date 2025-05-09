package com.example.springbootweb.controller;

import com.example.springbootweb.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {

//    // 原始方式
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        // 获取请求参数
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println("age = " + age);
//        return  "OK";
//    }

    // springboot 方式
    @RequestMapping("/simpleParam")
    public String simpleParam(String name , Integer age){
        System.out.println(name + ":"+ age);
        return  "OK";
    }

    // 实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    // 复杂实体参数
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }

    // 数组集合参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/listParam")
    // @RequestParam  绑定参数关系
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }

    // 日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }

    // json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    // 路径参数
    @RequestMapping("/path/{id}")
    public String PathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }

    // 路径参数
    @RequestMapping("/path/{id}/{name}")
    public String PathParam2(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+":"+name);
        return "OK";
    }


}
