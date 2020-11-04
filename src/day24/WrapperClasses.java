package day24;

public class WrapperClasses {
	public static void main(String[] args) {
		// byte, short, int, long
		// float, double
		// char
		// boolean
		
		byte b1 = 10;
		Byte b = 10;
		
		b++;
		b = 15;
		System.out.println(b);
		
		Short sh = 100;
		Integer num = 1000;
		Long l = 9999L;
		Float f = 9.9F;
		Double d = 10.9;
		Character ch = 'a';
		Boolean bool = false;
		
		System.out.println("Byte max value: " + Byte.MAX_VALUE);
		System.out.println("Min value: " + Byte.MIN_VALUE);
		
		String str = "123";
		int num1 = Integer.parseInt(str);
	
	}
}
