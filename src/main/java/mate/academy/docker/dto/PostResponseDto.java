package mate.academy.docker.dto;

import lombok.Data;

@Data
public class PostResponseDto {
    private Long id;
    private String title;
    private String body;
}
