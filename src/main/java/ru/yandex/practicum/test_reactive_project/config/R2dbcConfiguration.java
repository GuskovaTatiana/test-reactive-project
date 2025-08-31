package ru.yandex.practicum.test_reactive_project.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import ru.yandex.practicum.test_reactive_project.config.callback.ValidatePersonIdBeforeSaveCallback;
import ru.yandex.practicum.test_reactive_project.config.converter.PersonReadConverter;
import ru.yandex.practicum.test_reactive_project.config.converter.PersonWriteConverter;

import java.util.List;


//public class R2dbcConfiguration extends AbstractR2dbcConfiguration {
//
//    @Override
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return ConnectionFactories.get("r2dbc:h2:mem:///practicum?options=DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//    }
//
//    @Override
//    protected List<Object> getCustomConverters() {
//        // Зарегистрируйте конвертеры PersonReadConverter и PersonWriteConverter
//        return List.of(
//                new PersonReadConverter(),
//                new PersonWriteConverter()
//        );
//    }
//
//    @Bean
//    public ValidatePersonIdBeforeSaveCallback validatePersonIdBeforeConvertCallback() {
//        return new ValidatePersonIdBeforeSaveCallback();
//    }
//
//}
