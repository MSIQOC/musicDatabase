package com.example.music.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"Singer"})
public class Entertainment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entertainmentName;
    private String eAddress;
    private String eTelephoneNumber;
    private Long belongedSingerCount;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "entertainment")
    private List<Singer> SingerList;

}
