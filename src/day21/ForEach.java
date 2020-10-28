package day21;

public class ForEach {
	public static void main(String[] args) {
		int[] numArr = {49, 51, 66, 33, 87, 25, 21, 99, 101, 65};
		// print elements from array which is greater than 50
		
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > 50) {
				System.out.println(numArr[i]);
			}
		}
		System.out.println("------");
		// for each loop
		// [49, 51, 66, 33, 87, 25, 21, 99, 101, 65]
		for (int number : numArr) {
			System.out.print(number + " ");
		}
		System.out.println();
		String[] names = {"John", "Alex", "Kuba", "Khali", "Ang"};
		
		for (String name : names) {
			System.out.println(name);
		}
		
		char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		for (char ch : chars) {
			System.out.print(ch + " ");
		}
	}
}
