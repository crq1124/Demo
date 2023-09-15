package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hellowrold(){
        return "hellowrold Spring boot！\n 恶龙咆哮啊啊啊啊";
    }
}

