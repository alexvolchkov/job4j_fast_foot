package ru.job4j.service;

import ru.job4j.Dish;

import java.util.List;

public interface DishService {
    void addDish(Dish dish);

    List<Dish> getAll();
}
