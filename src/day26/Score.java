package day26;
import java.util.ArrayList;

public class Score {
	
	
	public static void main(String[] args) {
		ArrayList<Double> classScore = new ArrayList<>();
		classScore.add(89.9);
		classScore.add(100.0);
		classScore.add(78.1);
		classScore.add(99.9);
		classScore.add(65.6);
		
		double sum = 0.0;
		for (int i = 0; i < classScore.size(); i++) {			
			sum += classScore.get(i);
		}
		System.out.println("Sum: " + sum);
		
		// TODO increase value of each element by 10
		for (int i = 0; i < classScore.size(); i++) {
			classScore.set(i, classScore.get(i) + 10);
		}
		
		// [99.9, 110.0, 88.1, 109.9, 75.6]
		System.out.println(classScore);
	}
}
