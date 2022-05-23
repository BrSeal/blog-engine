package main.auth;

import main.repositories.PostRepository;
import main.dao.entities.ModerationStatus;
import main.dao.entities.User;
import org.springframework.stereotype.Service;

import java.security.Principal;

import static java.util.Optional.ofNullable;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public AuthService(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    public AuthUserDTO getAuthUser(Principal principal) {
        User user = ofNullable(principal).map(p -> userRepository.findByName(principal.getName()))
                .orElse(null);

        return authUserDtoFromUser(user);
    }

    private AuthUserDTO authUserDtoFromUser(User user) {
        if (user == null) return null;

        AuthUserDTO dto = new AuthUserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setPhoto(user.getPhoto());
        dto.setModeration(user.isModerator());

        if (user.isModerator()) {
            dto.setModeration(true);
            dto.setSettings(true);
            dto.setModerationCount(postRepository.countPostByModerationStatus(ModerationStatus.NEW));
        }

        return dto;
    }
}
