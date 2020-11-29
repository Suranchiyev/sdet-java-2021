package day30;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapReview2 {
	public static void main(String[] args) {
		// Map is key value data structure
		// Map keys are unique
		
		// hashMap does not maintain insertion order
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(0, "zero");
		hashMap.put(null, "Value");
		System.out.println(hashMap);
		System.out.println("-----------");
		
		// Hashtable os older version of HashMap
		// Hashtalbe vs HashMap
		// 1. HashMap is not synchronized(not thread safe) and Hashtable is synchronized(thread safe)
		// 2. HashMap allows one null key and multiple null values and Hashtable does not allow null key
		//    and values
		Map<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(1, "one");
		hashTable.put(2, "two");
		hashTable.put(3, "three");
		hashTable.put(4, "four");
		// hashTable.put(null, "value"); //  java.lang.NullPointerException: 
		// hashTable.put(5, null); // java.lang.NullPointerException
		System.out.println(hashTable);
		System.out.println("------------");
		
		// LinkedHashMap maintains insertion order
		Map<Integer, String> linkedMap = new LinkedHashMap<>();
		linkedMap.put(1, "one");
		linkedMap.put(2, "two");
		linkedMap.put(3, "three");
		linkedMap.put(0, "zero");
		System.out.println(linkedMap);
		System.out.println("------------");
		
		
		// TreeMap is sorted(by key) implementation of Map
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(4, "four");
		treeMap.put(2, "two");
		treeMap.put(3, "three");
		treeMap.put(1, "one");
		treeMap.put(0, "zero");
		System.out.println(treeMap);
		 
	}
}
