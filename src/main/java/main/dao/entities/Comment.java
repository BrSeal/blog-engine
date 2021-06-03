package main.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "post_comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Comment comment;

    @NotNull
    @ManyToOne
    private Post post;

    @NotNull
    @ManyToOne
    private User user;

    @NotNull
    private LocalDateTime time;

    @Lob
    @NotNull
    private String text;

}
