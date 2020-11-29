package day31;

import java.util.Stack;

public class BalancedStr {
	public static void main(String[] args) {
		// Break till 11:18 AM EST
		// [ ]
		// ( )
		// { }
		String str = "[({})]"; 
		System.out.println(isBalanced(str)); // true
		
		str = "[(]";
		System.out.println(isBalanced(str)); // false
		System.out.println(isBalanced("{(]}")); // false
		System.out.println(isBalanced("{()}")); // true
		System.out.println(isBalanced("{}()[]")); // true
		System.out.println(isBalanced("{}[()][]")); // true
		System.out.println(isBalanced("{")); // false
	}
	
	// "[(]"
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<>();
		// { ( [ - opening
		// } ) ] - closing 
		
		// st = []
		for (char ch : str.toCharArray()) {
			// ch = ']'
			// add opening par into stack
			if (ch == '{' || ch == '(' || ch == '[') {
				st.push(ch);
			} else {
				// if closing par
				
				//  get latest opening
				char latestOpenedPar = st.pop();
				
				// check if latest opening has correct closing
				if (latestOpenedPar == '{' && ch != '}') {
					return false;                  
				} else if (latestOpenedPar == '(' && ch != ')') {
					return false;
				} else if (latestOpenedPar == '[' && ch != ']') {
					return false;
				}
			}
		}
		
		if (st.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
