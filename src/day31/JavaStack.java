package day31;

import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		// Stack
		
		// LIFO - Last In First Out
		Stack<String> messages = new Stack<>();
		// push() will add element to the stack
		// it will push an item onto the top of this stack
		messages.push("Message from John");
		messages.push("Message from Alex");
		messages.push("Message from Smith");
		
		// pop() will get elements from the top(last added) of the stack
		// it will remove this element
		String msg = messages.pop();
		System.out.println("Reading " + msg);
		System.out.println("------");
		
		msg = messages.pop();
		System.out.println("Reading " + msg);
		System.out.println("------");
		
		msg = messages.pop();
		System.out.println("Reading " + msg);
		System.out.println("------");
		
		System.out.println(messages);
	}
}
