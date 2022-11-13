package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.Order;
import ru.job4j.Status;

@Service
public interface OrderService {

    Void createOrder(Order order);

    Status checkStatus(int orderId);
}
