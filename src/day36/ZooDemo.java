package day36;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZooDemo {
	public static void main(String[] args) {
		// Primate is parent class of Lemur
		
		Primate primate = new Lemur();
		primate.run();
		primate.eat();
		
		// Lemur lemur = new Primate();		
		
		// The methods and properties will be available
		// from reference type.
		
		// primate.climb();
		
		// type casting
		Lemur lemur = (Lemur)primate;
		lemur.climb();
		lemur.run();
		lemur.eat();
		
		//Primate primate2 = new Primate();
		//Lemur lemu2 = (Lemur)primate2; classCastException here
		
		Lemur lemur2 = new Lemur();
		Primate primate2 = lemur2; // auto casting
		
		// Bird is interface
		// Eagle is concrete class that implements Bird
		Bird bird = new Eagle();
		bird.fly(); // Overriding is runtime polymorphism
		
		// bird.hunt() we cannot use hunt method 
		// because methods will come from reference type(Bird)
		
		List<String> list = new ArrayList<>();		
		List<String> list2 = new LinkedList<>();
		
		list.add("A");
		list2.add("A");
	}
}
