package day35;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BoxDemo {
	public static void main(String[] args) {
		// Break till 2:22 PM EST
		
		// SmallBox box = new SmallBox();
		Box box = new NormalBox();
	
		box.put("book");
		box.put("pen");
		box.put("duck");
		
		System.out.println("Available space: " + box.getFreeSpace());
		System.out.println("Items in box: " + box.getItems());
		
		box.put("phone");
		box.put("apple");
		box.put("banana");
	
		System.out.println("Available space: " + box.getFreeSpace());
		System.out.println("Items in box: " + box.getItems());
	}
}
