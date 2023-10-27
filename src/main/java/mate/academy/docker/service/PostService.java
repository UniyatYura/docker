package mate.academy.docker.service;

import java.util.List;
import mate.academy.docker.dto.PostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import org.springframework.data.domain.Pageable;

public interface PostService {
    PostResponseDto save(PostRequestDto postRequestDto);

    List<PostResponseDto> findAll(Pageable pageable);
}
