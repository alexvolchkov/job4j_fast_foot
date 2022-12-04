package ru.job4j.service;

import ru.job4j.Dish;

import java.util.List;

public interface DishService {

    List<Dish> findAll();

    void add(Dish dish);
}
