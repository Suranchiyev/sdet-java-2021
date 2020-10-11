package day9;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		
		s1.firstName = "John";
		s1.lastName = "Doe";
		s1.course = "SDET JAVA";
		System.out.println("-----");
		s1.print();
	}
}
