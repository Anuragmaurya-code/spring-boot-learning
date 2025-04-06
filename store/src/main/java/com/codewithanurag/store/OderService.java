package com.codewithanurag.store;

public class OderService {
    public void placeOrder(){
        var order=new StripePaymentService();
        order.processPayment(200);
    }
}
