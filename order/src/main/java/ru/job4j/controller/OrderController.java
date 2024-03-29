package ru.job4j.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.Order;
import ru.job4j.Status;
import ru.job4j.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orders;

    public OrderController(OrderService orders) {
        this.orders = orders;
    }

    @PostMapping("/")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return new ResponseEntity<>(
                orders.createOrder(order),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<Status> checkStatus(@PathVariable int id) {
        return new ResponseEntity<>(
                orders.checkStatus(id),
                HttpStatus.OK
        );
    }
}
