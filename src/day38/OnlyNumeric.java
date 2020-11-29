package day38;

public class OnlyNumeric {
	public static void main(String[] args) {
		String str = "123";
		boolean isN = isNumeric(str);
		System.out.println(isN);
	}
	//                                  "123"
	public static boolean isNumeric(String str) {
		// if str contains only numeric values return true
		// otherwise return false
		try {
			Integer.parseInt(str);			
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
		// Break till 11:14 AM EST
	}
}
