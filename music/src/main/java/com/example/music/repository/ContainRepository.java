package com.example.music.repository;

import com.example.music.model.entity.Contain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainRepository extends JpaRepository<Contain, Long> {
}
