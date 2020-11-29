package day33;

public class Student extends Person {
	public String course;
	public double grade;
	
	public String getAllDetails() {
		return firstName + " " + lastName + " " + course;
	}
}
