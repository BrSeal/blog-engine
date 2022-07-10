package main.services;

import lombok.AllArgsConstructor;
import main.repositories.PostRepository;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PostService {

    PostRepository postRepository;

}
