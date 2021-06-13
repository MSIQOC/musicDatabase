package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Entertainment;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class EntertainmentRepositoryTest extends MusicApplicationTests {
    @Autowired
    private EntertainmentRepository entertainmentRepository;

    @Test
    public void create(){
        Entertainment entertainment = new Entertainment();
        entertainment.setEntertainmentName("heizeent");
        entertainment.setEAddress("서울시 강남구");
        entertainment.setETelephoneNumber("010-1234-4567");
        entertainment.setBelongedSingerCount(1L);

        Entertainment newEntertainment = entertainmentRepository.save(entertainment);
        Assert.assertNotNull(newEntertainment);
    }

    @Test
    @Transactional
    public void read(){
        Entertainment entertainment = entertainmentRepository.findFirstByEntertainmentNameOrderByIdDesc("heizeent");
        if(entertainment != null){
            entertainment.getSingerList().stream().forEach(singer -> {
               System.out.println("가수 이름: " + singer.getSingerName());
               System.out.println("데뷔날짜 : " + singer.getDebutDate());
            });
        }
        Assert.assertNotNull(entertainment);
    }
}
