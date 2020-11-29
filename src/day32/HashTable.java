package day32;

public class HashTable {
	private static final int HASH_MAX = 10;
	private Node2[] hashTable = new Node2[HASH_MAX];
	
	public void add(String value) {
		int index = hash(value);
		if (hashTable[index] == null) {
			hashTable[index] = new Node2(value);
		} else {
			addNode(hashTable[index], value);
		}
	}
	
	private void addNode(Node2  head, String value) {
		Node2 headC = head;
		while (headC.next != null) {
			headC = headC.next;
		}
		headC.next = new Node2(value);
	}
	
	private int hash(String str) {
		int code = 0;
		for (int i = 0; i < str.length(); i++) {           
			code = code + str.charAt(i);
		}
		return code % HASH_MAX;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Node2 head : hashTable) {
			if (head != null) {
				sb.append(nodesToString(head));
			}
		}
		
		return sb.toString();
	}
	
	private String nodesToString(Node2 head) {
		Node2 headC = head;
		StringBuilder strB = new StringBuilder();
		do {
			strB.append(headC.value + " ");
			headC = headC.next;
		} while (headC != null);
		
		return strB.toString();
	}
}
