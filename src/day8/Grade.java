package day8;

public class Grade {
	public static void main(String[] args) {
		int score = 70;
		char grade = getGrade(score);
		System.out.println(grade); // C
		
		System.out.println(getGrade(85));
		System.out.println(getGrade(-34));
	}
	
	// create a method that will accept one int argument score
	// Method will return char
	// if score within 90 and 100  -> 'A'
	// if score within 80 and 89   -> 'B'
	// if score within 70 and 79   -> 'C'
	// if score within 60 and 69   -> 'D'
 	// if score < 60               -> 'F'
	// if score is not in above range -> '0';
	
	public static char getGrade(int score) {
		if (score >= 90 && score <= 100) {
			return 'A';
		} else if (score >= 80 && score <= 89) {
			return 'B';
		} else if (score >= 70 && score <= 79) {
			return 'C';
		} else if (score >= 60 && score <= 69) {
			return 'D';
		} else if (score < 60 && score >= 0){
			return 'F';
		} else {
			return '0';
		}
	}
}
