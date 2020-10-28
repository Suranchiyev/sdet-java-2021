package day20;

public class Temp {
	public static void main(String[] args) {
		//                0  1       2    3  4      5     6
		double[] temp = {32, 30.5, 25.7, 26, 34.1, 31.5, 29};
		System.out.println("Size: " + temp.length);
		
		// find out sum of each element inside my temp array
		double sum = 0.0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		System.out.println("Sum is " + sum);
		
		double averageTemp = sum / temp.length;
		averageTemp = Math.round(averageTemp);
		System.out.println("Average is " + averageTemp);
		
		// TODO
		// print each temperature with message
		// if temp is above average: "32 above average temp"
		// if temp is below average: "25.7 below average temp"
		// if temp is average:       "30.0 average temp"
		for (int i = 0; i < temp.length; i++) {
			if (averageTemp < temp[i]) {
				System.out.println(temp[i] + " above average temp");
			} else if (averageTemp > temp[i]) {
				System.out.println(temp[i] + " below average temp");
			} else {
				System.out.println(temp[i] + " average temp");
			}
		}
	}
}





