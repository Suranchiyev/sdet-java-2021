package day5;

public class LocalVariables {
	
	public static void main(String[] args) 
	{
		// what is a variable?
		// Box to save/manipulate information

		int num = 5;
		String name = "Will Smith";

		System.out.println(name);

		String name1 = name;
		name = "Alex";

		// local variables
		// Local varibales are all the varibales which created
		// inside the methods or statements(if, loop and so on)

		// Access modifiers
		// public     - available everywhere
		// protected  - available inside same package or in subclass
		// default    - available inside same package only
		// private    - available inside same class only

	}
}