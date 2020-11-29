package day32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStructures {
	public static void main(String[] args) {
		String[] names = new String[5];
		// array is collection of data of same type
		// fixed size
		
		List<String> list = new ArrayList<>();
		// collection of data of same type
		// It's array based dynamic data structure
		
		List<String> list2 = new LinkedList<>();
		// Linked list with nodes
		// there is no random access
		// list2.get(0); will be much slower for LinekdList
		
		// no duplicates in Set
		Set<String> nameSet = new HashSet<>();
		// HashSet hashing mechanism, no insertion order
		// LinkedHashSet -> will maintain insertion order
		// TreeSet -> sorted Set
		
		// key value data structure
		// keys are unique
		Map<Integer, String> nameMap = new HashMap<>();
		// HashMap -> no insertion order
		// LinkedHashMap -> will insertion order
		// TreeMap -> Map sorted by keys
	}
}
