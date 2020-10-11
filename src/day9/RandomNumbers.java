package day9;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 0 - 9
		int rNum = random.nextInt(10);
		System.out.println(rNum);
		
		String res = getNumStr(rNum);
		System.out.println(res);
	}
	
	public static String getNumStr(int num) {
		if (num == 1) {
			return "One";
		} else if (num == 2) {
			return "Two";
		} else if (num == 3) {
			return "Three";
		} else if (num == 4) {
			return "Four";
		} else if (num == 5) {
			return "Five";
		} else {
			return "Not supported";
		}		
	}
}
