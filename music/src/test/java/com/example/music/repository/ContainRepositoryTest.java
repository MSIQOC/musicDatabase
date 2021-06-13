package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Contain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ContainRepositoryTest extends MusicApplicationTests {
    @Autowired
    private ContainRepository containRepository;

    @Test
    public void create(){
        Contain contain = new Contain();
        Contain newContain = containRepository.save(contain);
        Assert.assertNotNull(newContain);
    }
}
