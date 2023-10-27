package mate.academy.docker.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.docker.dto.PostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.service.PostService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/posts")
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostResponseDto save(@RequestBody PostRequestDto postRequestDto) {
        return postService.save(postRequestDto);
    }

    @GetMapping
    public List<PostResponseDto> getAll(Pageable pageable) {
        return postService.findAll(pageable);
    }
}
