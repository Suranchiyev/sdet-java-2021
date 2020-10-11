package day8;

public class MethodOverloading {
	// Method Overloading happens when the one class has two or more methods
	// with same name but different number of arguments, different type argument,
	// and different order of arguments. The return type can be different or same.
	
	// 1. different number of arguments
	// 2. different type argument
	// 3. different order of arguments
	
	public static void main(String[] args) {
		display("abc"); // first
		display("abc", "xyz"); // second
		display(23);
		display("age", 54);
		display(43, "age");
	}
	
	public static void display(String str) {
		System.out.println(str);
	}
	
	public static void display(String str, String str2) {
		System.out.println(str);
	}
	
	public static void display(int num) {
		System.out.println(num);
	}
	
	public static void display(String str, int num) {
		System.out.println(str + ", " + num);
	}
	
	public static void display(int num, String str) {
		System.out.println(str + ", " + num);
	}
}
