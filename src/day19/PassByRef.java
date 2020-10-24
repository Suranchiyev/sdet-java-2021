package day19;

public class PassByRef {
	public static void main(String[] args) {
		int i = 7;
		changeNum(i);
		System.out.println(i); // 7
		
		String str = "apple";
		addHello(str);
		System.out.println(str); // apple 
		
		StringBuilder sb = new StringBuilder("apple");
		addHello(sb);
		System.out.println(sb); // applehello
		
		StringBuilder a = new StringBuilder("orange");
		StringBuilder b = a;
		b.append(", banana");
		
		System.out.println(a);// orange, banana
		a.append(", kiwi");
		System.out.println(b); 
		
		String a1 = "apple";
		String b1 = a1;
		System.out.println(a1 == b1);
		
		b1 = b1 + ", banana";
		System.out.println(a1); // apple
	}
	
	public static void addHello(StringBuilder abc) {
		abc.append("hello");
	}
	
	public static void changeNum(int num) {
		// argument will take copy
		num = 100;
	}
	
	public static void addHello(String str) {
		str = str + "hello!";
	}
}
