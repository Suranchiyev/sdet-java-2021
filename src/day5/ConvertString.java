package day5;

public class ConvertString {
	public static void main(String[] args) {
		String strNum = "2344";
		System.out.println(strNum + 6); // 23446 Concatenation

		// convert String into int numberic data type 
		int num = Integer.parseInt(strNum);
		System.out.println(num + 6); // 2350

		double dNum = Double.parseDouble("25.67");
		System.out.println(dNum * 2);

		byte bNum = Byte.parseByte("23");
		short shNum = Short.parseShort("123");
		int intNum = Integer.parseInt("599");
		float fNum = Float.parseFloat("10.99");
		double doubleNum = Double.parseDouble("20.99");

		String str = "25.99";
		//int num2 = Integer.parseInt(str); // exception here
		//System.out.println(num2);

		//double dNum2 = Double.parseDouble("Rzx"); // exception here
		
		// BREAK 10 min till 9:12PM EST
	}
}