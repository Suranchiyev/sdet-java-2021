package day19;

public class StrBuilder {
	public static void main(String[] args) {
		// create StringBuilder with empty value
		StringBuilder sBuilder = new StringBuilder();
		
		// add value to StringBuilder by using append() method
		sBuilder.append("hello");
		System.out.println(sBuilder);
		
		sBuilder.append(", world!");
		System.out.println(sBuilder);
		
		StringBuilder tokyo = new StringBuilder();
		tokyo.append("Tokyo");
		System.out.println(tokyo); // Tokyo
		tokyo.append(" - population is 37,400,068");
		System.out.println(tokyo); // Tokyo - population is 37,400,068
		tokyo.append("ABC");
		System.out.println(tokyo); // Tokyo - population is 37,400,068ABC
		
		StringBuilder shaunghai = new StringBuilder("Shaunghai");
		System.out.println(shaunghai);
		shaunghai.append(" - population 25,582,000");
		shaunghai.append(". It is great city");
		System.out.println(shaunghai); // 1
		// reassign
		shaunghai = new StringBuilder();
		
		// Why do we need to use StringBuilder when we have String?
		String mexicoCity = "Mexico City";
		mexicoCity = mexicoCity + " - population is 21,581,000";
		System.out.println(mexicoCity); // 2
		
		// Efficiency - for StringBuilder we can reuse same object to change its value
		// For String to change it's value we need create new object
		// String is immutable
		// StringBuilder is mutable 
		
		String strNumbers = ""; // "123 ... 1000"
		for (int i = 1; i <= 1000; i++) {
			strNumbers = strNumbers + i;
		}
		// above snippet will create 1001 String objects
		System.out.println(strNumbers);
		
		
		StringBuilder sbNumbers = new StringBuilder();
		for (int i = 1; i <= 1000; i++) {
			sbNumbers.append(i);
		}
		// above snippet will create only 1 object of StringBuilder
		System.out.println(sbNumbers);
		
		// Do you I need to use all the time just StringBuilder because its more efficient?
		// No! 90% of time String is totaly fine
		
		// StringBuilder vs String
		// StringBuilder is mutable and String is immutable
		// StringBuilder has String methods + some extra methods
	}
}






