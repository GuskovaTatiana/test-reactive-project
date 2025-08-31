package ru.yandex.practicum.test_reactive_project;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.annotation.Id;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.data.relational.core.query.Update;
import reactor.core.publisher.Flux;
import ru.yandex.practicum.test_reactive_project.model.Order;
import ru.yandex.practicum.test_reactive_project.model.Person;
import ru.yandex.practicum.test_reactive_project.model.YandexPracticum;

import java.util.List;
import java.util.stream.LongStream;

import static org.springframework.data.relational.core.query.Criteria.where;
import static org.springframework.data.relational.core.query.Query.query;

@SpringBootApplication
public class TestReactiveProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TestReactiveProjectApplication.class);
//		R2dbcEntityTemplate template = ctx.getBean(R2dbcEntityTemplate.class);
//
//		template.getDatabaseClient()
//				.sql("create table if not exists persons(id bigint primary key, first_name text not null, second_name text not null)")
//				.then()
//				.block();
//
//		Person person = new Person();
//		person.setId(1L);
//		person.setFirstName("First Name");
//		person.setSecondName("Second Name");
//
//		template.insert(person).block();
//		template.select(Person.class)
//				.matching(query(where("id").is(1L)))
//				.one()
//				.subscribe(it -> {
//					System.out.println(it.getId()); // 1
//					System.out.println(it.getFirstName()); // First Name
//					System.out.println(it.getSecondName()); // Second Name
//				});
//
//		Person okPerson = new Person();
//		okPerson.setId(2L);
//		okPerson.setFirstName("Correct");
//		okPerson.setSecondName("Person");
//		template.insert(okPerson).subscribe(it -> System.out.println("Запись успешно вставлена"));
//
//		Person illegalIdPerson = new Person();
//		illegalIdPerson.setId(-1L);
//		illegalIdPerson.setFirstName("Incorrect");
//		illegalIdPerson.setSecondName("Person");
//
//		template.insert(illegalIdPerson)
//				.doOnError(e -> System.out.println("Ошибка при вставке Person: " + e.getMessage()))
//				.subscribe();


		//------------------------------------------------
//		ConnectionFactory connectionFactory = ConnectionFactories.get("r2dbc:h2:mem:///practicum?options=DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//		R2dbcEntityTemplate template = new R2dbcEntityTemplate(connectionFactory);
//
//		// Вызов метода block противоречит реактивному программированию.
//		// В данном примере он нужен, чтобы гарантировать последовательность действий.
//		template.getDatabaseClient().sql("create table if not exists practicum(v varchar(255))")
//				.then()
//				.block();
//
//		template.getDatabaseClient().sql("create table if not exists orders(\n" +
//						"    id bigserial primary key, \n" +
//						"    username     text not null, \n" +
//						"    created_at   timestamp not null \n" +
//						");")
//				.then()
//				.block();
//
//		YandexPracticum practicum = new YandexPracticum();
//		practicum.setValue("Yandex.Practicum");
//		template.insert(YandexPracticum.class)
//				.into("practicum")
//				.using(practicum)
//				.block();
//
//		template.select(YandexPracticum.class)
//				.from("practicum")
//				.matching(Query.query(Criteria.where("v").isNotNull()))
//				.one()
//				.map(YandexPracticum::getValue)
//				.map(String::toLowerCase)
//				.map(it -> it.replace(".", " "))
//				.subscribe(System.out::println);
//
//		template.select(Order.class)
//				.matching(Query.empty()) // Пустой запрос
//				.count()
//				.subscribe(it -> System.out.println("Найдено строк: " + it));
//
//
//		template.getDatabaseClient()
//				.sql("create table person(id bigserial not null, username varchar(128) not null, active boolean)")
//				.then()
//				.block();
//
//		Flux.fromStream(LongStream.rangeClosed(1L, 10L).boxed())
//				.map(TestReactiveProjectApplication::testPerson)
//				.flatMap(template::insert)
//				.collectList()
//				.block();
//
//		// UPDATE person SET active = 'false' WHERE id >= 5
//		template.update(Person.class)
//				.matching(Query.query(Criteria.where("id").greaterThanOrEquals(5)))
//				.apply(Update.update("active", Boolean.FALSE))
//				.subscribe(it -> System.out.println("Обновлено строк:" + it)); // 6
//
//		// DELETE FROM person WHERE active is true
//		template.delete(Person.class)
//				.matching(Query.query(Criteria.where("active").isTrue()))
//				.all()
//				.subscribe(it -> System.out.println("Удалено строк:" + it)); // 4
//		// вывести строки
//		List<Long> ids = template.select(Person.class)
//				.from("person")
//				.matching(Query.query(Criteria.where("id").greaterThan(0)
//				))
//				.all()
//				.map(Person::getId)
//				.collectList()
//				.block();
//
//		System.out.println(ids);

	}


//	static Person testPerson(Long id) {
//		Person p = new Person();
//		p.setId(id);
//		p.setUsername("Test #" + id);
//		p.setActive(Boolean.TRUE);
////		p.setActive(id % 2 == 0);
//		return p;
//	}
}
