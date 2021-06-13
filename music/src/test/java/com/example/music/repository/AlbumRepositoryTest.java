package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Album;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Optional;


public class AlbumRepositoryTest extends MusicApplicationTests {

    @Autowired
    private AlbumRepository albumRepository;

    @Test
    public void create(){
        Album album = new Album();
        album.setAlbumName("수록곡 1집");
        album.setReleaseDate(LocalDate.of(2019, 3, 4));
        //album.setReleaseDate(LocalDateTime.now());
        Album newAlbum = albumRepository.save(album);
        Assert.assertNotNull(newAlbum);
        System.out.println("newAlbum : " + newAlbum);
    }

    @Test
    @Transactional
    public void read(){
        Album album = albumRepository.findByAlbumName("수록곡 1집");
        if(album != null) {
            album.getContainList().stream().forEach(contain -> {
                System.out.println("트랙이름: " + contain.getTrack().getTrackName());
                System.out.println("좋아요수: "+contain.getTrack().getLikes());
            });
        }
        Assert.assertNotNull(album);
    }

    public void update(){
        Optional<Album> album = albumRepository.findById(1L);
        album.ifPresent(selectAlbum ->{
            selectAlbum.setAlbumName("라일락");
            selectAlbum.setReleaseDate(LocalDate.of(2019, 5, 10));

            albumRepository.save(selectAlbum);
        });
    }

    @Test
    @Transactional
    public void delete(){
        Optional<Album> album = albumRepository.findById(2L);
        Assert.assertTrue(album.isPresent());
        album.ifPresent(selectAlbum -> {
            albumRepository.delete(selectAlbum);
        });
        Optional<Album> deleteAlbum = albumRepository.findById(2L);

        Assert.assertFalse(deleteAlbum.isPresent());
    }


}
