package com.codewithanurag.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

//		SpringApplication.run(StoreApplication.class, args);
//		var orderService=new OderService(new StripePaymentService());
//		orderService.placeOrder();
		var orderService=new OderService(new PaypalPaymentService(),300);
		orderService.placeOrder();
	}

}
