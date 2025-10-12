package com.turkcell.order_service.controller;

import com.turkcell.order_service.client.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
    private ProductClient productClient;

    public OrdersController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping
    public String get() {
        String responseFromProductService = productClient.get("Halit");
        return "Order Service Çalıştı, Product Serviceden Gelen Cevap: " + responseFromProductService;
    }

}
