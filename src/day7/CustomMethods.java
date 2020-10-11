package day7;

public class CustomMethods {
	public static void main(String[] args) {
		myMethod("Goood morning!");
		sayAloha();

		String str = getAloha();
		System.out.println(str); // Aloha, Friends!

		printExclamation("Apple"); // Apple!
		printExclamation("Orange"); // Orange!

		double res = plus100(9.9);
		System.out.println(res); // 109.9
		
		System.out.println(join("abc", "xyz")); 

		int result = addition(4, 9, 10); 
		System.out.println(result);

		System.out.println(addition(1, 2, 3));

		displayInfo("John", "Doe", 38);
		displayInfo("Ilia", "Stepanov", 28);
		displayInfo("ABC", "ABc", 10000);
	}	

	public static void displayInfo(String firstName, String lastName, int age) {
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("age: " + age);
	}


	/*
		6.
		Create a static method 'addition' with return type int
		Method should accept three int arguments
		Method should return sum of its arguments
		Ex: System.out.pritnln(addition(5, 6, 5)); // 16
	*/
		public static int addition(int one, int two, int three) {
			int sum = one + two + three;
			return sum;
		}

	/*
		5.
		Create a static method with name 'join' and return type String
		Method should accept two String arguments
		Method should return its two arguments concatenated together.

		Ex:
		System.out.pritln(join("abc","xyz")); //abcxyz
	*/
		public static String join(String str1, String str2) {
			return str1 + str2;
		}


	/* 
		4.
		- Create a static method with name 'plus100'
		- Method should accept one double argument and return the argument
		increased by 100
		- Use this method in the main method and print the result

		Ex: 
		dobule dRes = plus100(5.5);
		System.out.println(dRes); // 105.5
	*/
		public static double plus100(double dNum) {
			dNum = dNum + 100;
			return dNum;
		}



	/*
		3.
		Create static method with name 'printExclamation'
		Method should accept one String argument and print it with exclamation mark in the end
		Use your method in the main method

		Ex: printExclamation("Apple"); // Apple!
		Ex: printExclamation("Orange"); // Orange!
	*/
		public static void printExclamation(String name) {
			System.out.println(name + "!"); 
		}


	/*
		2. 
		Create a static method 'getAloha'
		Method should return "Aloha, Friends!" as String
		Call the method in the main method and print returned value
	*/
	public static String getAloha() {
		String str = "Aloha, Friends!";
		return str;
	}


	/*
		1.
		Create a static void method with name 'sayAloha'
		Method should print "Aloha, Friends!"
		Use in the main method
	*/ 
	public static void sayAloha() {
		System.out.println("Aloha, Friends!");
	}
	

	public static void myMethod(String str) {
		System.out.println(str);
	}
}