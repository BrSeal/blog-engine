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

    @NotNull
    boolean isActive;

    @NotNull
    @Enumerated(EnumType.STRING)
    ModerationStatus moderationStatus;

    @NotNull
    @ManyToOne
    User moderator;

    @NotNull
    @ManyToOne
    User user;

    @NotNull
    LocalDateTime time;

    @NotNull
    String title;

    @Lob
    @NotNull
    String text;

    @NotNull
    int view_count;
}
