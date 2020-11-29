package day37;

import java.util.Set;

public class ChocolateDemo {
	public static void main(String[] args) {
		// static block will be executed one time 
		// in the beginning
		
		// if the class is used by any ways.
		Chocolate obj = new Chocolate();
		
		Set<String> chs = Chocolate.chocolates;
		
		Chocolate obj2 = new Chocolate();
		
		Chocolate obj3 = new Chocolate("apple");
		
	}
} 
