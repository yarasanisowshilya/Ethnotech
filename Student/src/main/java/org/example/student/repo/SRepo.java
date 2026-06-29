package org.example.student.repo;

import org.example.student.entity.SEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SRepo extends JpaRepository<SEntity,Integer> {
}
