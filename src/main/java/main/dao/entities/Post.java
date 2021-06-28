package main.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    boolean isActive;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    ModerationStatus moderationStatus;

    @ManyToOne
    @JoinColumn(nullable = false)
    User moderator;

    @ManyToOne
    @JoinColumn(nullable = false)
    User user;

    @Column(nullable = false)
    LocalDateTime time;

    @Column(nullable = false)
    String title;

    @Lob
    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    int view_count;
}
