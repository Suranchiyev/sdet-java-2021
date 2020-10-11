package day11;

public class StrContains {
	public static void main(String[] args) {
		// .contains(string) us used to check if string contains another string
		// it will return boolean
		
		String topics = "variables, assignment operators, arithmetic operators, input from terminal";
		boolean isThere = topics.contains("input");
		System.out.println(isThere);
		
		System.out.println(topics.contains("java")); // false
		System.out.println(topics.contains(" terminal")); // true
		
		System.out.println(topics.contains("ors, ar")); // true
		System.out.println(topics.contains("ors,ar")); // false
		System.out.println(topics.contains("variables") && topics.contains("arithmetic")); // true
	}
}
