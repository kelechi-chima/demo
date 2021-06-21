package com.demo.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Order {
    
    private final String id;
    private final LocalDate orderDate;
    private final List<OrderItem> orderItems;
    
    public Order(final LocalDate orderDate, final List<OrderItem> orderItems) {
        this.id = UUID.randomUUID().toString();
        this.orderDate = orderDate;
        this.orderItems = orderItems;
    }
    
    public String getId() {
        return id;
    }
    
    public LocalDate getOrderDate() {
        return orderDate;
    }
    
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
