package com.example.music.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"containList", "releaseCompany"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String albumName;
    private LocalDate releaseDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "album")
    private List<Contain> containList;

    @ManyToOne
    private ReleaseCompany releaseCompany;
}

