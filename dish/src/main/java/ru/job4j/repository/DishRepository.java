package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.Dish;

@Repository
public interface DishRepository extends CrudRepository<Dish, Integer> {
}
