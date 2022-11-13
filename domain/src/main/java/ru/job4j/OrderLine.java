package ru.job4j;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderLine {
    @EqualsAndHashCode.Include
    private int id;
    private Dish dish;
    private int amountOfDish;
    private int total;
}
