package ru.yandex.practicum.test_reactive_project.config.converter;

import org.springframework.data.r2dbc.mapping.OutboundRow;
import org.springframework.r2dbc.core.Parameter;
import ru.yandex.practicum.test_reactive_project.model.Person;
import org.springframework.core.convert.converter.Converter;

public class PersonWriteConverter implements Converter<Person, OutboundRow> {
    @Override
    public OutboundRow convert(Person source) {
        OutboundRow row = new OutboundRow()
                .append("first_name", Parameter.from(source.getFirstName()))
                .append("second_name", Parameter.from(source.getSecondName()));

        if (source.getId() != null) {
            row = row.append("id", Parameter.from(source.getId()));
        }

        return row;
    }
}
