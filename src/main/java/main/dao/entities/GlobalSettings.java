package main.dao.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class GlobalSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(unique = true)
    private String code;

    @NotNull
    private String name;

    @NotNull
    private String value;
}
