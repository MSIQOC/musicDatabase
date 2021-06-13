package com.example.music.repository;

import com.example.music.model.entity.Entertainment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntertainmentRepository extends JpaRepository<Entertainment, Long> {
    Entertainment findFirstByEntertainmentNameOrderByIdDesc(String entertainmentName);
}
