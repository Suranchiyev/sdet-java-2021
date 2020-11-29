package day33;

public class Dog {
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
		//
		if (age < 0) {
			// ideally, throw exception
			System.out.println("Wrong input");
		} else {
			this.age = age;
		}
	}
	// Break 10 min till 8:15 PM EST
}
