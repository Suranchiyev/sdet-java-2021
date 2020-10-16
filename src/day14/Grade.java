package day14;

public class Grade {
	public static void main(String[] args) {
		displayScore('b');
	}
	
	public static void displayScore(char grade) {
		// if grade is 'A' or 'a' then print - "90 - 100"
		// if grade is 'B' or 'b' then print - "65 - 89"
		// if grade is 'C' or 'c' then print - "50 - 64"
		// if grade is 'F' or 'f' then print - "> 50"
		// otherwise print - "invalid grade"
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("90 - 100");
			break;
		case 'B':
		case 'b':
			System.out.println("65 - 89");
			break;
		case 'C':
		case 'c':
			System.out.println("50 - 64");
			break;
		case 'F':
		case 'f':
			System.out.println("> 50");
			break;
		default:
			System.out.println("invalid grade");
			break;
		}
	}
}
