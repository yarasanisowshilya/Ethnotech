package org.example.votingcal.repo;

import org.example.votingcal.entity.VEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VRepo extends JpaRepository<VEntity,Integer> {

}
