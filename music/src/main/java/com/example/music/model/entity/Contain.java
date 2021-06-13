package com.example.music.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@Entity(name = "contain")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"track", "album"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class Contain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private LocalDateTime createdAt;

    @ManyToOne
    private Track track;

    @ManyToOne
    private Album album;
}
