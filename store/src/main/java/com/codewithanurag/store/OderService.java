package com.codewithanurag.store;

public class OderService {
    private PaymentService paymentService;

    private double amount;
    public OderService(PaymentService paymentService,double amount){
        this.paymentService=paymentService;
        this.amount=amount;
    }
    public void placeOrder(){
        paymentService.processPayment(this.amount);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
