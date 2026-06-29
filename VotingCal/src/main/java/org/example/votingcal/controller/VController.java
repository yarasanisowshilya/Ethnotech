package org.example.votingcal.controller;

import org.example.votingcal.entity.VEntity;
import org.example.votingcal.service.VService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VController {

    @Autowired
    private VService ser;

    @PostMapping("/add")
    public VEntity add(@RequestBody VEntity en)
    {
        return ser.StoreData(en);

    }

}
