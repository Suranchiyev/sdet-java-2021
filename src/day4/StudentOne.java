package day4;

public class StudentOne {
	public static void main(String[] args) {
		String name = "John Doe";
		double grade = 80.0;

		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
		
		grade = grade + (grade * 0.08);

		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);

	}
}