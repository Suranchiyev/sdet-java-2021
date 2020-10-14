package day13;

public class DisplayScore {
	enum Grade {A, B, C, F}
	
	public static void main(String[] args) {
		displayScore(Grade.A);
		displayScore(Grade.B);
		
		Grade g2 = Grade.C;
		
		System.out.println(g2);
		displayScore(g2);
		
		String str = g2.toString();
		System.out.println(str);
	}
	
	// if grade is A then print: "90 - 100"
	// if grade is B then print: "65 - 90"
	// if grade is C then print: "50 - 65"
	// if grade is F then print: "> 50"
	public static void displayScore(Grade g) {
		if (g.equals(Grade.A)) {
			System.out.println("90 - 100");
		} else if (g.equals(Grade.B)) {
			System.out.println("65 - 90");
		} else if (g.equals(Grade.C)) {
			System.out.println("50 - 65");
		} else if (g.equals(Grade.F)) {
			System.out.println("> 50");
		}
	}
}
