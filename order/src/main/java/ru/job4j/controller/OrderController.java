package ru.job4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import ru.job4j.Order;
import ru.job4j.Status;
import ru.job4j.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orders;

    @Autowired
    private KafkaTemplate<Integer, String> template;

    public OrderController(OrderService orders) {
        this.orders = orders;
    }

    @PostMapping("/")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) {
        var result = new ResponseEntity<>(
                orders.createOrder(order),
                HttpStatus.CREATED
        );
        template.send("create-order", String.valueOf(order.getId()));
        return result;
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<Status> checkStatus(@PathVariable int id) {
        return new ResponseEntity<>(
                orders.checkStatus(id),
                HttpStatus.OK
        );
    }
}
