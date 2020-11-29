package day32;

public class LinkedList2 {
	private Node head;
	
	public void add(int value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		
		Node headCopy = head;
		while (headCopy.next != null) {
			headCopy = headCopy.next;
		}
		
		headCopy.next = new Node(value);
	}
	
	public void remove(int value) {
		if (head.value == value) {
			head = head.next;
			return;
		}
		
		Node cHead = head;
		Node prevNode = cHead;
		
		while (cHead != null) {
			if (cHead.value == value) {
				prevNode.next = cHead.next;
				return;
			}			
			prevNode = cHead;
			cHead = cHead.next;
		}
	}
	
	public String toString() {
		Node cHead = head;
		String str = "[";
		do {
			str += cHead.value + ", ";
			cHead = cHead.next;
		} while (cHead != null);
		
		str = str.substring(0, str.length() - 2);
		
		return str + "]";
	}
}




