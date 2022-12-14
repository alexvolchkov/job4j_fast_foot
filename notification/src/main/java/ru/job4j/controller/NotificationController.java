package ru.job4j.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationController {

    @KafkaListener(topics = "create-order")
    public void createOrder(ConsumerRecord<Integer, String> input) {
        String value = input.value();
        System.out.println("Order id " + value);
    }
}
