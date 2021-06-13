package com.example.music.repository;

import com.example.music.model.entity.Representation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepresentationRepository extends JpaRepository<Representation, Long> {
}
