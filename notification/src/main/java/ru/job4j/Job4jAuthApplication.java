package ru.job4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableKafka
@EnableAsync
public class Job4jAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jAuthApplication.class, args);
    }

}
