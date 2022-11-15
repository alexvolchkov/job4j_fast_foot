package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.job4j.service.DishServiceImpl;

@Controller
@RequestMapping("/dishes")
public class DishController {
    private final DishServiceImpl dishes;

    public DishController(DishServiceImpl dishes) {
        this.dishes = dishes;
    }

    @GetMapping("")
    public String dishes(Model model) {
        model.addAttribute("dishes", dishes.findAll());
        return "dishes";
    }
}
