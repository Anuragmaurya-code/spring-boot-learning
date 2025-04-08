package com.codewithanurag.store;

import org.springframework.stereotype.Component;


public interface PaymentService {
    void processPayment(double amount);
}
