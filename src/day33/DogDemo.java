package day33;

public class DogDemo {
	
	public static void main(String[] args) {
		Dog obj = new Dog();
		// obj.name = "Tuzik";
		// obj.age = -4;
		
		obj.setName("Tuzik");
		obj.setAge(-4);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}
