package com.turkcell.product_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/products")
@RestController
public class ProductsController {
    @GetMapping
    public String get(@RequestParam String name) {
        System.out.println("Bu konsoldaki product service çalıştı.");
        return "Merhaba" + name + " , Product-Service";
    }
}
