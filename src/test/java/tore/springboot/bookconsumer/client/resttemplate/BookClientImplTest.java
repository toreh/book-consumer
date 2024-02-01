package tore.springboot.bookconsumer.client.resttemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import tore.springboot.bookconsumer.model.BookDTO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookClientImplTest {

    @Autowired
    BookClientImpl bookClient;

    @Test
    void getBookById() {
        BookDTO book = bookClient.getBookById(1L);
        System.out.println("===>>>getBookById: " + book);
    }

    @Test
    void getBookByAuthor() {
    }
}