package day31;

public class Shopping {
	public static void main(String[] args) {
		FamilyMember.money = 1000;
		
		FamilyMember husband = new FamilyMember("John");
		FamilyMember wife = new FamilyMember("Milena");
		
		husband.spendMoney(25);
		System.out.println(husband.money); // 975
		
		wife.spendMoney(700);
		System.out.println(wife.money); // 275
		
		System.out.println(FamilyMember.money); // static way by class name
		
		// what is a static keyword in Java?
		// static members(variables, methods) belong to class 
		// not to specific object
		// We need to use static members by class name
	}
}
