package ru.yandex.practicum.test_reactive_project.serivce;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.yandex.practicum.test_reactive_project.model.Book;
import ru.yandex.practicum.test_reactive_project.service.BookService;

@SpringBootTest
@ActiveProfiles("test")
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testCreateBook() {
        bookService.createBook("Реактивное программирование в Java")
                .doOnNext(book -> Assertions.assertThat(book)
                        .withFailMessage("Результат сохранения не должен быть пустым")
                        .isNotNull()
                        .withFailMessage("Сохранённой книге должен быть присвоен ID")
                        .extracting(Book::getId)
                        .isNotNull()
                ).block(); // блокируемся на тестовом потоке до завершения реактивной цепочки
    }
}
