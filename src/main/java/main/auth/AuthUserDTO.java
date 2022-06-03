package main.auth;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AuthUserDTO {
    private Long id;
    private String name;
    private String photo;
    private String email;
    private boolean moderation;
    private int moderationCount;
    private boolean settings;

}
