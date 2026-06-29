package org.example.votingcal.service;

import org.example.votingcal.entity.VEntity;
import org.example.votingcal.repo.VRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VService {

    @Autowired
    private VRepo repo;

    public VEntity StoreData( VEntity en)
    {
        if(en.getAge()>=18)
        {
            en.setElligible(true);
        }

        return repo.save(en);

    }
}
