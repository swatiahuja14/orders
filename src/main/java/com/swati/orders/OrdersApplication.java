package com.swati.orders;

import com.swati.orders.common.db.OrdersRepository;
import com.swati.orders.common.types.Order;
import com.swati.orders.services.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrdersApplication {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Application has started!");
			// Custom startup logic here
			/*for(Order o:orderService.fetchOrdersList()){
				System.out.println("Order "+o);
			};*/
			for(int i =1; i<5; i++){
				System.out.println("Get Orders "+i);
				for(Order o:orderService.getOrder(i)){
					System.out.println("Order "+o);
				};
			}
		};
	}
}
