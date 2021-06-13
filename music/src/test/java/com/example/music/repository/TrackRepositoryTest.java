package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Track;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class TrackRepositoryTest extends MusicApplicationTests {
    @Autowired
    private TrackRepository trackRepository;

    @Test
    public void create(){
        Track track = new Track();
        track.setTrackName("blueming 1집");
        track.setLikes(0);

        Track newTrack = trackRepository.save(track);
        Assert.assertNotNull(newTrack);
    }

    @Test
    @Transactional
    public void read(){
        Track track = trackRepository.findByTrackName("blueming 1집");
        if(track != null) {
            track.getContainList().stream().forEach(contain -> {
                System.out.println("앨범이름: " + contain.getAlbum().getAlbumName());
                System.out.println("발매날짜: "+contain.getAlbum().getReleaseDate());
            });
        }
        Assert.assertNotNull(track);
    }


}
