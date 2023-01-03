package ru.job4j.service;

import ru.job4j.Order;
import ru.job4j.Status;

public interface OrderService {

    Order createOrder(Order order);

    Status checkStatus(int orderId);
}
