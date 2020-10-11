package day4;

public class Swap {
	public static void main(String[] args) {
		String juice = "super white";
		String milk = "very red";

		System.out.println("juice: " + juice);
		System.out.println("milk: " + milk);

		String tmpStr = juice;
		juice = milk;
		milk = tmpStr;

		System.out.println("-------------");
		System.out.println("juice: " + juice);
		System.out.println("milk: " + milk);
	}
}