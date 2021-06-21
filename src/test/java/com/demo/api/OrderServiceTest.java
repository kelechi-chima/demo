package com.demo.api;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    
    private final List<Order> orders = asList(
        new Order(LocalDate.of(2020, 3, 1), asList(
            new OrderItem("Sony headphones", new BigDecimal("199")),
            new OrderItem("Sony smartwatch", new BigDecimal("250")))),
    
        new Order(LocalDate.of(2020, 4, 12), singletonList(
            new OrderItem("MacBook Pro", new BigDecimal("1500")))),
    
        new Order(LocalDate.of(2020, 2, 20), singletonList(
            new OrderItem("Electric mower", new BigDecimal("150")))),
    
        new Order(LocalDate.of(2020, 5, 13), asList(
            new OrderItem("Hedge trimmer", new BigDecimal("89.99")),
            new OrderItem("Chain Saw", new BigDecimal("89.99")))));
    
    private final OrderService service = new OrderService(orders);
    
    @Test
    public void shouldReturnOrdersWithTotalAmountGreaterThanGivenAmount() {
        List<Order> result = service.ordersAbove(new BigDecimal("200"));
        assertEquals(2, result.size());
    }
    
    @Test
    public void shouldReturnOrdersMadeBeforeGivenDate() {
        List<Order> result = service.ordersBefore(LocalDate.of(2020, 5, 1));
        assertEquals(3, result.size());
    }
    
    @Test
    public void shouldReturnOrdersMadeAfterGivenDate() {
        List<Order> result = service.ordersAfter(LocalDate.of(2020, 5, 1));
        assertEquals(1, result.size());
    }
}
