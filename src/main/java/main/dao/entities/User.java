package main.dao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    boolean isModerator;

    @NotNull
    LocalDateTime regTime;

    String email;
    String password;

    /**
     * код для восстановления пароля, может быть NULL
     */
    String code;

    /**
     * фотография (ссылка на файл), может быть NULL
     */
    String photo;
}
