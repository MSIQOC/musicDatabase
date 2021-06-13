package com.example.music.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@ToString(exclude = {"album"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class ReleaseCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CompanyName;
    private String rcAddress;
    private String rcTelephoneNumber;
    private Long releasedAlbumCount;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "releaseCompany")
    private List<Album> albumList;
}
