package tore.springboot.bookconsumer.client.resttemplate;

import tore.springboot.bookconsumer.model.AuthorBookDTO;
import tore.springboot.bookconsumer.model.BookDTO;

import java.util.List;


public interface BookClient {
    BookDTO getBookById(long id);
    List<AuthorBookDTO> getBookByAuthor(long id);
}
