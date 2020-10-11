package day10;

public class Student {
	public String name;
	public double grade;
	public static String school;
	
	public static void main(String[] args) {
		Student stOne = new Student();
		stOne.name = "John";
		stOne.grade = 99;
		System.out.println(stOne.name);
		
		Student stTwo = new Student();
		stTwo.name = "Alex";
		System.out.println("Grade: " + stTwo.grade);
		System.out.println(stTwo.name);
		
		System.out.println(stOne.name); // John
		System.out.println(stTwo.name); // Alex
		
		stTwo.grade = 10;
		System.out.println(stOne.grade); // 10
	}
}
