package com.example.music.repository;

import com.example.music.MusicApplicationTests;
import com.example.music.model.entity.Participation;
import com.example.music.model.entity.Singer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ParticipationRepositoryTest extends MusicApplicationTests {
    @Autowired
    private ParticipationRepository participationRepository;

    @Test
    public void create(){
        Participation participation = new Participation();
        Participation newParticipation = participationRepository.save(participation);
        Assert.assertNotNull(newParticipation);
    }


}
