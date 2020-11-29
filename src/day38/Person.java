package day38;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
//			System.out.println("Age cannot be negative");
//			return;
			throw new IllegalArgumentException("Age cannot be negative");
		}
		
		this.age = age;
	}
}
