package day38;

public class SomeExceptions {
	public static void main(String[] args) {
		// NullPointerException - we get when object(reference) is null
		// and program is trying to use it's properties or methods
		// String str = null;
		String str = "apple";
		// str.length();
		str = str.toUpperCase();
		
		//String strNum = "432ab";
		String strNum = "432";
		int num = Integer.parseInt(strNum);
		System.out.println("Num: " + num);
		
		String str1 = "apple";
		str1 = str1.substring(0, 3);
		
		int[] arr = new int[3];
		arr[2] = 8;
		System.out.println("Here");
	}
}
