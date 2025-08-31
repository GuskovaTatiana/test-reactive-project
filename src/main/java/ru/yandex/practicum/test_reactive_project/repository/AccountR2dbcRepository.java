package ru.yandex.practicum.test_reactive_project.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import ru.yandex.practicum.test_reactive_project.model.Account;

import java.math.BigDecimal;

@Repository
public interface AccountR2dbcRepository extends ReactiveCrudRepository<Account, Integer> {
    // возвращаем все аккаунты с балансом больше amount
    Flux<Account> findAccountsByBalanceGreaterThan(BigDecimal amount);
}
