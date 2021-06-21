package com.demo.api;

import java.math.BigDecimal;

public class OrderItem {
    
    private final String product;
    private final BigDecimal amount;
    
    public OrderItem(final String product, final BigDecimal amount) {
        this.product = product;
        this.amount = amount;
    }
    
    public String getProduct() {
        return product;
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
}
