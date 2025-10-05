package com.turkcell.payment_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/payments")
@RestController
public class PaymentsController {
    @GetMapping
    public String get() {
        return "Merhaba, Payment-Service";
    }
}
