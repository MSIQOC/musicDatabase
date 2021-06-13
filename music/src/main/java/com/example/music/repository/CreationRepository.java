package com.example.music.repository;

import com.example.music.model.entity.Creation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreationRepository extends JpaRepository<Creation, Long> {
}
