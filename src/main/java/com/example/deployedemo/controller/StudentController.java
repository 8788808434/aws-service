package com.example.deployedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   @GetMapping("/get")
    public String get()
    {
        System.out.println("hhhhh");
        return "hello aws";
    }
}
