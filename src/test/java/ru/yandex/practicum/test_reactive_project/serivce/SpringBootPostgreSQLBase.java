package ru.yandex.practicum.test_reactive_project.serivce;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest // интеграционный тест с поднятием контекста
@Testcontainers // обозначаем необходимость инициализации тест-контейнеров
@ActiveProfiles("test")
public class SpringBootPostgreSQLBase {
    private static PostgreSQLContainer<?> postgres;

    static {
        postgres = new PostgreSQLContainer<>("postgres:15");
        postgres.start();
    }

//    @DynamicPropertySource
//    static void registerPgProperties(DynamicPropertyRegistry registry) {
//        registry.add("spring.datasource.url", postgres::getJdbcUrl);
//        registry.add("spring.datasource.username", postgres::getUsername);
//        registry.add("spring.datasource.password", postgres::getPassword);
//    }
}
