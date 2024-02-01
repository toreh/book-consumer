package tore.springboot.bookconsumer.client.resttemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tore.springboot.bookconsumer.model.AuthorBookDTO;
import tore.springboot.bookconsumer.model.BookDTO;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookClientImpl implements BookClient{
    private final RestTemplateBuilder restTemplateBuilder;
    private static final String GET_BOOK_BY_ID_PATH = "/api/v1/book/{id}";
    @Override
    public BookDTO getBookById(long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        //ResponseEntity<String> stringResponse = restTemplate.getForEntity("http://localhost:8080/api/v1/book/1", String.class);
        BookDTO book = restTemplate.getForObject(GET_BOOK_BY_ID_PATH, BookDTO.class, id);
        System.out.println(book);

        return book;
    }

    @Override
    public List<AuthorBookDTO> getBookByAuthor(long id) {
        return null;
    }
}
