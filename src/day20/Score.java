package day20;

public class Score {
	public static void main(String[] args) {
		int[] score = new int[5];
		//    0    1     2   3    4   
		// [ [70] [80] [65] [75] [90] ]	
		score[0] = 70;
		score[1] = 80;
		score[4] = 90;
		score[2] = 65;
		score[3] = 75;
		// ArrayIndexOutOfBound exception
		// score[5] = 100; We don't have 6th element in the array 
		//                 because we created array of size 5
		System.out.println(score[2]);
		System.out.println(score[4]); // 90
		
		score[0] = score[0] * 2;
		System.out.println(score[0]);
		
		score[2] = score[4];
		System.out.println(score[2]); // 90
		
		System.out.println(score);
	}
}





