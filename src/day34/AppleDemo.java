package day34;

public class AppleDemo {
	public static void main(String[] args) {
		Apple obj = new Apple();
		System.out.println(obj.getClass());
		Class className = obj.getClass();
		
		// .equals(Object obj)
		// .hasCode()
		Apple apple = new Apple("red");
		Apple apple1 = new Apple("red");
		
		
		// by default it will work exactly as ==
		// then we can override equals and make it work specifically for our own comparison.
		if (apple.equals(apple1)) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}
		
		
		
	}
}
