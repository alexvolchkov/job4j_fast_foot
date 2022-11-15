package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.Dish;
import ru.job4j.repository.DishRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    private final DishRepository dishes;

    public DishServiceImpl(DishRepository dishes) {
        this.dishes = dishes;
    }

    @Override
    public void addDish(Dish dish) {

    }

    @Override
    public List<Dish> getAll() {
        List<Dish> rsl = new ArrayList<>();
        dishes.findAll().forEach(rsl::add);
        return rsl;
    }
}
