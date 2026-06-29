package org.example.student.controller;

import org.example.student.entity.SEntity;
import org.example.student.service.SService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SController {
    @Autowired
    private SService ser;

    @PostMapping("/add")
    public SEntity add(@RequestBody SEntity en)
    {

        return ser.std(en);

    }

    @GetMapping("/getAll")
    public List<SEntity> add()
    {

        return ser.getAllStudents();

    }
}
