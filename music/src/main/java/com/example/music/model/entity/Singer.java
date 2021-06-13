package com.example.music.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long singerNumber;
    private String singerName;
    private LocalDate debutDate;

    //N : 1
    @ManyToOne
    private Entertainment entertainment;

}
