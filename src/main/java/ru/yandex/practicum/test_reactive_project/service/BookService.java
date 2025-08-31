package ru.yandex.practicum.test_reactive_project.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.test_reactive_project.model.Book;
import ru.yandex.practicum.test_reactive_project.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Mono<Book> createBook(String name) {
        return bookRepository.save(new Book(name));
    }
}
