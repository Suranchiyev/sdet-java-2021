package day32;

public class HashTableDemo2 {
	public static final int HASH_MAX = 10;
	public static void main(String[] args) {
		Node2[] hashTable = new Node2[HASH_MAX];
		
		int index = hash("John");
		Node2 n = new Node2("John");
		
		hashTable[index] = n;
		
		int index2 = hash("Kuzzat");
		Node2 n1 = new Node2("Kuzzat");
		
		hashTable[index2].next = n1;
	}
	
	public static int hash(String str) {
		int code = 0;
		for (int i = 0; i < str.length(); i++) {
			code += str.charAt(i);
		}
		
		return code % HASH_MAX;
	}
}
