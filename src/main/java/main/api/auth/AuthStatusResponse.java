package main.api.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AuthStatusResponse {
    private boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AuthUserDTO user;

    public AuthStatusResponse(AuthUserDTO user) {
        result = user != null;
        this.user = user;
    }
}
