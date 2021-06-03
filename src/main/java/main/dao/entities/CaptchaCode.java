package main.dao.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class CaptchaCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private LocalDateTime time;

    @NotNull
    @Column(columnDefinition = "tinytext")
    private String code;

    @NotNull
    @Column(columnDefinition = "tinytext")
    private String secretCode;
}
