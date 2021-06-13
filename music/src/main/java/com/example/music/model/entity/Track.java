package com.example.music.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@ToString(exclude = {"containList", "participationList"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)

public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trackName;
    private int likes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "track")
    private List<Contain> containList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "track")
    private List<Participation> participationList;
}