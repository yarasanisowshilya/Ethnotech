package org.example.student.service;
import org.example.student.entity.SEntity;
import org.example.student.repo.SRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SService {

    @Autowired
    private SRepo repo;

    public SEntity std(SEntity en)
    {
        if(en.getAge()>0)
        {
            return repo.save(en);
        }
        return null;
    }
    public List<SEntity> getAllStudents() {
        return repo.findAll();
    }

}
