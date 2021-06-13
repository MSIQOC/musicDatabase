package com.example.music.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long creatorNumber;
    private String creatorName;
    private Long composedSongCount;
    private Long arrangedSongCount;
    private Long writtenSongCount;
    private int cflag;
    private int wflag;
    private int aflag;

}
