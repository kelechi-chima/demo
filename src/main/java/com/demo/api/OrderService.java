package com.demo.api;

import static java.util.Collections.emptyList;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    
    private final List<Order> orders;
    
    public OrderService(final List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> orders() {
        return emptyList();
    }

    public List<String> orderIds() {
        return emptyList();
    }
    
    public List<Order> ordersAbove(BigDecimal amount) {
        return emptyList();
    }
    
    public List<Order> ordersBefore(final LocalDate date) {
        return emptyList();
    }
    
    public List<Order> ordersAfter(final LocalDate date) {
        return emptyList();
    }
}
