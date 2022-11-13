package ru.job4j;

import lombok.Data;

@Data
public class Card {
    private int id;
    private String number;
    private Customer customer;
}
