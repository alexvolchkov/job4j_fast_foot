package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
