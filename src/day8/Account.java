package day8;

public class Account {
	public static void main(String[] args) {
		int savings = 50000;
		int salary = 100000;
		int expenses = 70000;
		
		// Create a static void method
		// if salary more than expenses or savings more than expenses
		// then print "Good! Still Alive!"
		// Otherwise print "Bankrupt"
		
		seeFinance(savings, salary, expenses);
		
		seeFinance(50000, 60000, 70000);
	}
	
	public static void seeFinance(int savings, int salary, int expenses) {
		if (salary > expenses || savings > expenses) {
			System.out.println("Good! Still Alive!");
		} else {
			System.out.println("Bankrupt");
		}
	}	
}
