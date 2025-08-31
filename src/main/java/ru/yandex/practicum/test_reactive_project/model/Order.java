package ru.yandex.practicum.test_reactive_project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Table("orders")
public class Order {
    @Id
    private Long id;
    private String username;
    @Column("create_at")
    private LocalDateTime createdAt;

    @Version // Указываем, что данное поле является версией
    private Long version;
}
