package main.dao.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class CaptchaCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(columnDefinition = "tinytext", nullable = false)
    private String code;

    @Column(columnDefinition = "tinytext", nullable = false)
    private String secretCode;
}
