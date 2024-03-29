package tore.springboot.bookconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthorBookDTO {

    private Long authorId;
    private String name;
    private Long bookId;
    private String title;
    private String source;
}
