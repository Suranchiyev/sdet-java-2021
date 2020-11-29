package day38;

public class HandleExceptions {
	public static void main(String[] args) {
		String str = null;	
		
		try {
			System.out.println("Length: " + str.length());
			
		} catch(NullPointerException e) {
			// e.printStackTrace();
			// System.out.println(e); //e will hold information about exception
			System.out.println("str was null");
		}
		
		System.out.println("in line 15");
		System.out.println("------------------");
		
		String str1 = "123r";
		int number = 0;
		try {
			
			number = Integer.parseInt(str1);
			
		} catch (RuntimeException e) {
			System.out.println(e);
			System.out.println(str1 + " does not have good format");
		}
	}

}
