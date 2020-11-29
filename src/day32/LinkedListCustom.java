package day32;

public class LinkedListCustom {
	public static void main(String[] args) {
		Node headNode = new Node(1);
		System.out.println(headNode.next);
		// [1] -> [2] -> [3] 
		
	 	// Node second = new Node(2);		
		headNode.next = new Node(2);
		
		System.out.println(headNode.next.next);	
		headNode.next.next = new Node(3);
		
		// headNode.next.next.next = new Node(4);
		Node copyOfHead = headNode;
		while(copyOfHead.next != null) {
			copyOfHead = copyOfHead.next;
		}
		copyOfHead.next = new Node(4);
		
		// add new node in the beginning of the list
		Node node5 = new Node(5);
		node5.next = headNode;
		headNode = node5;
		
		printList(headNode);
		
		add(headNode, 6);
		add(headNode, 99);
		add(headNode, 100);
		printList(headNode);
		
		headNode = remove(headNode, 2);
		printList(headNode);
		
		headNode = remove(headNode, 100);
		printList(headNode);
		
		headNode = remove(headNode, 200);
		printList(headNode);
	}
	
	public static Node remove(Node head, int value) {
		if (head.value == value) {
			head = head.next;
			return head;
		}
		
		Node copyHead = head;
		Node prevNode = copyHead;
		
		while (copyHead != null) {
			
			if (copyHead.value == value) {
				prevNode.next = copyHead.next;
				return head;
			}
			
			prevNode = copyHead;
			copyHead = copyHead.next;
		}
		
		return head;
		
	}
	
	public static void add(Node head, int value) {
		while (head.next != null) {
			head = head.next;
		}
		head.next = new Node(value);
	}
	
	public static void printList(Node head) {
		do {
			System.out.print(head.value +  " ");
			head = head.next;
		} while (head != null);
		System.out.println();
	}
}
