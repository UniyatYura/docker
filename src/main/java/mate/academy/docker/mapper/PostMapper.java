package mate.academy.docker.mapper;

import mate.academy.docker.config.MapperConfig;
import mate.academy.docker.dto.PostRequestDto;
import mate.academy.docker.dto.PostResponseDto;
import mate.academy.docker.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface PostMapper {
    PostResponseDto toPostDto(Post post);

    @Mapping(target = "id", ignore = true)
    Post toPostModel(PostRequestDto postRequestDto);
}
