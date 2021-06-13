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
public class ReleaseCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CompanyNumber;
    private String CompanyName;
    private String rcAddress;
    private String rcTelephoneNumber;
    private Long releasedAlbumCount;


}
