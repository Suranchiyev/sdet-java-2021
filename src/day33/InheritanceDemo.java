package day33;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 28;
		obj.course = "Java";
		obj.grade = 80.9;
		System.out.println(obj.getAllDetails());
		
		Employee empl = new Employee();
		empl.firstName = "Alex";
		empl.lastName = "Rodriguez";
		empl.employeeId = 25;
	}
}
