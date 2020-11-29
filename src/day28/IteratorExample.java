package day28;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		// Iterator
		// Collection framework
		// ArrayList<String> list = new ArrayList<>();
		// 
		
		List<String> list = new ArrayList<>(); 
		list.add("apple");
		list.add("banana");
		list.add("kiwi");
		list.add("orange");
		System.out.println(list.get(0));
		
		List<String> list2 = new LinkedList<>(); // LinkedList implementation 
		list2.add("apple");
		list2.add("banana");
		System.out.println(list2.get(0));
		
		System.out.println("----------");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
