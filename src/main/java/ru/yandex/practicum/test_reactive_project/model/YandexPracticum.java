package ru.yandex.practicum.test_reactive_project.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;

@Setter
@Getter
public class YandexPracticum {
    @Column("v")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
