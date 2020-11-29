package day31;

public class FamilyMember {
	public String name;
	public static double money;
	
	public FamilyMember(String name) {
		this.name = name;
	}
	
	public void spendMoney(double amount) {
		money = money - amount;
	}
}
