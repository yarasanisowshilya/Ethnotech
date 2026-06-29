package org.example.springboot_project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/name")//mapping to get method to see the
    public String hello_Name()
    {
        return "Hello! Iam Sowshilya";
    }
}

