package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Singer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
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

    @Test
    @Transactional
    public void read(){
        Singer singer = singerRepository.findBySingerName("헤이즈");
        if(singer != null){
            System.out.println("가수이름: "+singer.getSingerName());
            singer.getParticipationList().stream().forEach(participation -> {
                participation.getTrack().getContainList().forEach(contain -> {
                   System.out.println("앨범이름: "+contain.getAlbum().getAlbumName());
                   System.out.println("앨범발매날짜: "+contain.getAlbum().getReleaseDate());
                });
                System.out.println("수록곡이름: " + participation.getTrack().getTrackName());
                System.out.println("좋아요수: "+participation.getTrack().getLikes());
            });
        }
    }
}
