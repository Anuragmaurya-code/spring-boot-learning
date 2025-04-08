package com.codewithanurag.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(StoreApplication.class, args);
		var orderService=context.getBean(OderService.class);
		orderService.placeOrder();
//		var orderService=new OderService(new StripePaymentService());
//		orderService.placeOrder();
//		var orderService=new OderService(new PaypalPaymentService(),300);
//		orderService.placeOrder();
	}

}
