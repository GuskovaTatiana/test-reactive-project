package ru.yandex.practicum.test_reactive_project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table("account")
public class Account {
    @Id
    private Integer id;
    private String name;
    private BigDecimal balance = BigDecimal.valueOf(10_000L);

    public Account() {
    }

    public Account(String name) {
        this.name = name;
    }

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
