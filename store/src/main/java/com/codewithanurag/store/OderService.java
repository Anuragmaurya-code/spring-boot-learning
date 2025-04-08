package com.codewithanurag.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OderService {
    private PaymentService paymentService;

    private double amount;
    @Autowired
    public OderService(@Qualifier("paypal") PaymentService paymentService){
        this.paymentService=paymentService;
    }

    public OderService(){}
    public void placeOrder(){
        paymentService.processPayment(200);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
