package mate.academy.docker.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.docker.dto.PostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.mapper.PostMapper;
import mate.academy.docker.model.Post;
import mate.academy.docker.repository.PostRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public PostResponseDto save(PostRequestDto postRequestDto) {
        Post post = postMapper.toPostModel(postRequestDto);
        Post savePost = postRepository.save(post);
        return postMapper.toPostDto(savePost);
    }

    @Override
    public List<PostResponseDto> findAll(Pageable pageable) {
        return postRepository.findAll(pageable).stream()
                .map(postMapper::toPostDto)
                .toList();
    }
}
