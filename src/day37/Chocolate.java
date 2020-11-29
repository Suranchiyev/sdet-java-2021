package day37;

import java.util.HashSet;
import java.util.Set;

public class Chocolate {
	public static Set<String> chocolates;
	
	static {
		// static block
		System.out.println("In static block");
		
		// init some variables / loading some data
		chocolates = new HashSet<>();
		chocolates.add("Raffaello");
		chocolates.add("Godiva");
	}
	
	{
		System.out.println("Initializer block");
		// always executes before any constructor
	}
	
	public Chocolate() {
		System.out.println("default constructor");
	}
	
	public Chocolate(String str) {
		System.out.println("constructor with one arg");
	}
	
	
	
}
