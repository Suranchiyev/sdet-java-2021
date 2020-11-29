package day32;

import java.util.Arrays;

public class HashTableDemo {
	public static final int HASH_MAX = 10;
	
	public static void main(String[] args) {
		String[] hashTable = new String[HASH_MAX];
		
		int index = hash("John");
		System.out.println("John: " + index); // John: 9
		//          9
		hashTable[index] = "John";
		
		index = hash("Alex"); 
		System.out.println("Alex: " + index); // Alex: 4
		//          4
		hashTable[index] = "Alex";
		
		System.out.println(Arrays.toString(hashTable));
		
		// check if String "John" in the array
		index = hash("John");
		System.out.println(index); //  9
		System.out.println(hashTable[index]);
		
		hashTable[hash("Bob")] = "Bob";
		hashTable[hash("Smith")] = "Smith";
		hashTable[hash("James")] = "James";
		hashTable[hash("Sophia")] = "Sophia";
		System.out.println(Arrays.toString(hashTable));
		
		System.out.println("---------");
		index = hash("Kuzzat");
		System.out.println("Kuzzat: " + index);
		hashTable[index] = "Kuzzat";
		System.out.println(Arrays.toString(hashTable));
		
	}
	
	public static int hash(String str) {
		int code = 0;
		for (int i = 0; i < str.length(); i++) {           
			code = code + str.charAt(i);
		}
		// System.out.println(code);
		
		return code % HASH_MAX;
	}
}
