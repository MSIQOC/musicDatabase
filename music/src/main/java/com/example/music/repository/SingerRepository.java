package com.example.music.repository;

import com.example.music.model.entity.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends JpaRepository<Singer, Long> {
    Singer findBySingerName(String singerName);
}
