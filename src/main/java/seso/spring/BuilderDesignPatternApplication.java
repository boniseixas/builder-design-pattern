package seso.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import seso.spring.order.OrderBuilder;
import seso.spring.order.OrderedItems;

import java.io.IOException;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BuilderDesignPatternApplication.class, args);

		OrderBuilder builder = new OrderBuilder();

		OrderedItems orderedItems = builder.preparePizza();

		orderedItems.showItems();

		System.out.println("\n");
		System.out.println("Total Cost: " + orderedItems.getCost());
	}

}
