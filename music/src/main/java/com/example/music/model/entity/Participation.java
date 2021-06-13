package com.example.music.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@ToString(exclude = {"singer", "track"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Track track;

    @ManyToOne
    private Singer singer;

}
