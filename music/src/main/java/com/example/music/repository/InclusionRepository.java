package com.example.music.repository;

import com.example.music.model.entity.Inclusion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InclusionRepository extends JpaRepository<Inclusion, Long> {
}
