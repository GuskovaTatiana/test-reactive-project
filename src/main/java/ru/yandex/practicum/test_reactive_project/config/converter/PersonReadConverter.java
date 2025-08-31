package ru.yandex.practicum.test_reactive_project.config.converter;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.core.convert.converter.Converter;
import io.r2dbc.spi.Row;
import ru.yandex.practicum.test_reactive_project.model.Person;

public class PersonReadConverter implements Converter<Row, Person> {
    @Override
    public Person convert(Row source) {
        Person person = new Person();
        person.setId(source.get("id", Long.class));
        person.setFirstName(source.get("first_name", String.class));
        person.setSecondName(source.get("second_name", String.class));
        return person;
    }
}
