package ru.yandex.practicum.test_reactive_project.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.test_reactive_project.model.Book;

@Repository
public interface BookRepository  extends ReactiveCrudRepository<Book, Integer> {
}
