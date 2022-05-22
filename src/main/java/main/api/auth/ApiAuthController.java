package main.api.auth;

import main.api.auth.AuthService;
import main.api.auth.AuthStatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("api/auth/")
public class ApiAuthController {

    private final AuthService authService;

    public ApiAuthController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * Authenticated
     *
     * {
     * "result": true,
     * "user": {
     * "id": 576,
     * "name": "Дмитрий Петров",
     * "photo": "/avatars/ab/cd/ef/52461.jpg",
     * "email": "petrov@petroff.ru",
     * "moderation": true,
     * "moderationCount": 56,
     * "settings": true
     * }
     * }
     *
     * Not authenticated
     * {"result": false}
     */
    @GetMapping("check")
    public AuthStatusResponse authStatus(Principal principal){

        return new AuthStatusResponse(authService.getAuthUser(principal));
    }
}
