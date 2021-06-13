package com.example.music.repository;

import com.example.music.model.entity.ReleaseCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseCompanyRepository extends JpaRepository<ReleaseCompany, Long> {
}
