package com.example.music.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@ToString(exclude = {"participationList", "entertainment"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String singerName;
    private LocalDate debutDate;
    //private Long entertainment_id;
    //N : 1
    @ManyToOne
    private Entertainment entertainment;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "singer")
    private List<Participation> participationList;

}
