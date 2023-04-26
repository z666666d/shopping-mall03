package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class TestController {

    @GetMapping("/test")
    public String test(){
        // return "灰度版本！";
        return "正式版本！";
    }


}
