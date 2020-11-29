package day32;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList2 nums = new LinkedList2();
		nums.add(55);
		nums.add(35);
		nums.add(65);
		nums.add(75);
		nums.add(44);
		
		System.out.println(nums);
		
		nums.remove(35);
		System.out.println(nums);
	}
}
