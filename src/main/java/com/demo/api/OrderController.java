package com.demo.api;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
    private final OrderService orderService;
    
    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> orders() {
        return orderService.orders();
    }

    @GetMapping("/ids")
    public List<String> orderIds() {
        return orderService.orderIds();
    }
    
    @GetMapping("/above/{amount}")
    public List<Order> highValueOrders(BigDecimal amount) {
        return orderService.ordersAbove(amount);
    }
    
    @GetMapping("/before/{date}")
    public List<Order> ordersBefore(@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date) {
        return orderService.ordersBefore(date);
    }
    
    @GetMapping("/after/{date}")
    public List<Order> ordersAfter(@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date) {
        return orderService.ordersAfter(date);
    }
}
