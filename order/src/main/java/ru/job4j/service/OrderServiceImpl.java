package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.Order;
import ru.job4j.Status;
import ru.job4j.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orders;

    public OrderServiceImpl(OrderRepository orders) {
        this.orders = orders;
    }

    @Override
    public Order createOrder(Order order) {
        orders.save(order);
        return order;
    }

    @Override
    public Status checkStatus(int orderId) {
        return null;
    }
}
