package day34;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
	public static final String[] AVAILABLE_TOPPINGS = 
		{
				"Pepperoni",
				"Mushrooms",
				"Onions",
				"Cheese",
				"Hot sauce"
		};
	
	private String pizzaName;
	private List<String> toppings;
	
	public String getPizzaName() {
		return pizzaName;
	}
	
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	
	public List<String> getToppings() {
		// return toppings; we cannot return original reference
		
		// for mutable objects in getter method
		// we return copy 
		return new ArrayList<>(toppings);
	}
	
	public void setToppings(List<String> toppings) {
		for (String topping : toppings) {
			if (!Arrays.asList(AVAILABLE_TOPPINGS).contains(topping)) {
				System.out.println("ERROR: "+ topping + " is not available");
				return; // exist from the method
			}
		}
		
		this.toppings = toppings;
	}
}
