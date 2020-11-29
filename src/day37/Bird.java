package day37;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bird implements CanFly {
	
	@Override
	public void canFly() {
		System.out.println("Bird is flying");
	}
	
	public static void main(String[] args) {
		CanFly obj = new Bird();
		
		Map<String, String> map = new HashMap<>();
		
		map = new TreeMap<>();
		map.put("USA", "DC");
		
		// Break till 8:22 PM EST
	}
}
