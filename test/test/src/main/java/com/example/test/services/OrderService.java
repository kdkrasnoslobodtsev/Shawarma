package com.example.test.services;

import com.example.test.models.Order;
import com.example.test.models.Shawarma;
import com.example.test.repositories.OrderRepository;
import com.example.test.repositories.ShawarmaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void saveOrder(Order product) {
        log.info("Saving new {}", product);
        orderRepository.save(product);
    }
}
