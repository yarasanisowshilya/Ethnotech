package org.example.springboot_project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//it is a bean
public class HelloController {

    @GetMapping("/hello")//mapping to get method to see the
    public String hello()
    {
        return "Hello World!";
    }
}
