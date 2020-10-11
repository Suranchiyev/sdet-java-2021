package day8;

public class Score {
	public static void main(String[] args) {
		char grade = 'A';
		String scoreMessage = getScoreMsg(grade);
		System.out.println(scoreMessage);
	}
	
	// create a method that will accept one char argument grade
	// Method will return String
	// if grade is equal to 'A' -> "Your score more than 90"
	// if grade is equal to 'B' -> "Your score within 80 - 90"
	// if grade is equal to 'C' -> "Your score within 70 - 80"
	// if grade is equal to 'D' -> "Your score within 60 - 70"
 	// if grade is equal to 'F' -> "Your score is less than 60"
	// if grade is not in above range -> "Not valid grade(A,B,C,D,F)"
	
	public static String getScoreMsg(char grade) {
		if (grade == 'A') {
			return "Your score more than 90";
		} else if (grade == 'B') {
			return "Your score within 80 - 90";
		} else if (grade == 'C') {
			return "Your score within 70 - 80";
		} else if (grade == 'D') {
			return "Your score within 60 -70";
		} else if (grade == 'F') {
			return "Your score is less than 60";
		} else {
			return "Not valid grade(A,B,C,D,F)";
		}
	}
	
 }
