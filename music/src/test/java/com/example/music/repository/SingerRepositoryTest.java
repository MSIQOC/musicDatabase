package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Singer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class SingerRepositoryTest extends MusicApplicationTests {
    @Autowired
    private SingerRepository singerRepository;

    @Test
    public void create(){
        Singer singer = new Singer();
        singer.setSingerName("헤이즈");
        singer.setDebutDate(LocalDate.of(2016,01,01));
        Singer newSinger = singerRepository.save(singer);
        Assert.assertNotNull(newSinger);
    }
}
