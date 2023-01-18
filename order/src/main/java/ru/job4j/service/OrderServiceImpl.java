package ru.job4j.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.job4j.Order;
import ru.job4j.Status;
import ru.job4j.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orders;
    private final KafkaTemplate<Integer, String> template;

    public OrderServiceImpl(OrderRepository orders, KafkaTemplate<Integer, String> template) {
        this.orders = orders;
        this.template = template;
    }

    @Override
    public Order createOrder(Order order) {
        orders.save(order);
        template.send("create-order", String.valueOf(order.getId()));
        return order;
    }

    @Override
    public Status checkStatus(int orderId) {
        return null;
    }
}
