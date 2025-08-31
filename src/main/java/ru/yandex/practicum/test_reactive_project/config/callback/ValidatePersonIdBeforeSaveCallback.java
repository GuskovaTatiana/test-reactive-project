package ru.yandex.practicum.test_reactive_project.config.callback;

import org.reactivestreams.Publisher;
import org.springframework.data.r2dbc.mapping.OutboundRow;
import org.springframework.data.r2dbc.mapping.event.BeforeSaveCallback;
import org.springframework.data.relational.core.sql.SqlIdentifier;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.test_reactive_project.model.Person;

import java.util.Objects;

public class ValidatePersonIdBeforeSaveCallback implements BeforeSaveCallback<Person> {

    @Override
    public Publisher<Person> onBeforeSave(Person entity, OutboundRow row, SqlIdentifier table) {
        // Ваш код тут
        // Необходимо проверить значение идентификатора на правильность
        if (Objects.isNull(entity.getId()) || entity.getId() <= 0L) {
            return Mono.error(new IllegalArgumentException("Недопустимое значение идентификатора"));
        }
        return Mono.just(entity);
    }
}
