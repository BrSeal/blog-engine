package main.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * лайки и дизлайки постов
 */

@Getter
@Setter
@Entity
@Table(name = "post_votes")
public class PostVote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @OneToOne
    User user;

    @NotNull
    @ManyToOne
    Post post;

    @NotNull
    LocalDateTime time;

    /**
     * лайк или дизлайк: 1 или -1
     */
    @NotNull
    byte value;
}
