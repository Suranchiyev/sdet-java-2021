package day11;

public class HouseDemo3 {
	public static void main(String[] args) {
		// What does null means?
		// null means that reference is not pointing to any object
		
		House house = null;
		System.out.println(house);
		// int num = null; primitives cannot hold null;
		
		house.address = "101 Main st";
		
		// When you get NullPointerException?
		// When my reference/pointer is null and I try to use it's property, it will throw
		// NullPointerException
	}
}
