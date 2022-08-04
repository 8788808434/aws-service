package com.example.deployedemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public String get()
    {
        return "hello aws";
    }
}
