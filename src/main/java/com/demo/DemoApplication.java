package com.demo;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.api.Order;
import com.demo.api.OrderItem;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public List<Order> orders() {
		return asList(
			new Order(LocalDate.of(2020, 3, 1), asList(
				new OrderItem("Sony headphones", new BigDecimal("199")),
				new OrderItem("Sony smartwatch", new BigDecimal("250")))),
			
			new Order(LocalDate.of(2020, 4, 12), singletonList(
				new OrderItem("MacBook Pro", new BigDecimal("1500")))),
			
			new Order(LocalDate.of(2020, 2, 20), singletonList(
				new OrderItem("Electric mower", new BigDecimal("150")))),
			
			new Order(LocalDate.of(2020, 5, 13), asList(
				new OrderItem("Hedge trimmer", new BigDecimal("89.99")),
				new OrderItem("Chain Saw", new BigDecimal("89.99")))),
			
			new Order(LocalDate.of(2020, 3, 7), singletonList(
				new OrderItem("Diamond necklace", new BigDecimal("600")))),
			
			new Order(LocalDate.of(2020, 4, 14), singletonList(
				new OrderItem("Fancy shoes", new BigDecimal("300")))),
			
			new Order(LocalDate.of(2020, 6, 2), asList(
				new OrderItem("Silver bracelet", new BigDecimal("75")),
				new OrderItem("Diamond earrings", new BigDecimal("499"))))
		);
	}
}
