package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.ReleaseCompany;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class ReleaseCompanyRepositoryTest extends MusicApplicationTests {
    @Autowired
    private ReleaseCompany releaseCompanyRepository;

    @Test
    public void create(){

    }

    @Test
    @Transactional
    public void read(){

    }
}
