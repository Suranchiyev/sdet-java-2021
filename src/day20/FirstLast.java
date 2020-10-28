package day20;

public class FirstLast {
	public static void main(String[] args) {
//		double[] tmp = new double[7];
//		tmp[0] = 32;
//		tmp[1] = 35.5;
		//                    0       1         2
		String[] team = {"Ramehs", "Milena", "Vikas"};
		System.out.println(team[2]); // Vikas
		int size = team.length;
		
		//                  0    1      2     3    4     5     6
		double[] tmpWeek = {32, 35.5, 25.7, 26.9, 31.5, 29.9, 28.1};		
		// System.out.println(tmp[7]);
		
		System.out.println(tmpWeek[0]); // print first element
		
		int lastIndex = tmpWeek.length - 1;
		System.out.println(tmpWeek[lastIndex]); // get last element
		
		System.out.println("Size of array: " + tmpWeek.length);
		double sumOfFL = getFirstLast(tmpWeek);
		System.out.println(sumOfFL); // 60.1
	}
	
	public static double getFirstLast(double[] arr) {
		// return sum of first and last elements from arr argument array
		return arr[0] + arr[arr.length - 1];
	}
}
