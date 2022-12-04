package ru.job4j.controller;

import org.springframework.web.bind.annotation.*;
import ru.job4j.Dish;
import ru.job4j.service.DishService;

import java.util.List;

@RestController
@RequestMapping("/api-dish")
public class DishController {
    private final DishService dishes;

    public DishController(DishService dishes) {
        this.dishes = dishes;
    }

    @GetMapping("/getAll")
    public List<Dish> getAll() {
        return dishes.getAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Dish dish) {
        dishes.addDish(dish);
    }

}
