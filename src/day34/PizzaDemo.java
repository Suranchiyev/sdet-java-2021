package day34;

import java.util.List;
import java.util.ArrayList;

public class PizzaDemo {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setPizzaName("Veggie Pizza");
		
		List<String> toppings = new ArrayList<>();
		toppings.add("Pepperoni");
		toppings.add("Mushrooms");
		toppings.add("Onions");
		// toppings.add("Pineapple");	
		pizza.setToppings(toppings);
		
		System.out.println("Pizza Name: " + pizza.getPizzaName());
		System.out.println("Toppings: " + pizza.getToppings());
		
		List<String> toppings2 = pizza.getToppings();
		toppings2.add("Pineapple");
		toppings2.add("Sugar");
		toppings2.add("Kiwi");
		
		System.out.println("-----------");
		System.out.println("Pizza Name: " + pizza.getPizzaName());
		System.out.println("Toppings: " + pizza.getToppings());
	}
}
