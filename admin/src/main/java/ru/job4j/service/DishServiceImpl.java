package ru.job4j.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.job4j.Dish;

import java.util.Collections;
import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    @Value("${api-url-dish}")
    private String apiDish;

    private final RestTemplate client;

    public DishServiceImpl(RestTemplate client) {
        this.client = client;
    }

    @Override
    public List<Dish> findAll() {
        return getList(String.format(
                "%s/getAll", apiDish
        ));
    }

    @Override
    public void add(Dish dish) {
        client.postForEntity(String.format("%s/create", apiDish), dish, Dish.class).getBody();
    }

    private List<Dish> getList(String url1) {
        List<Dish> body = client.exchange(
                url1, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Dish>>() {
                }
        ).getBody();
        return body == null ? Collections.emptyList() : body;
    }
}
