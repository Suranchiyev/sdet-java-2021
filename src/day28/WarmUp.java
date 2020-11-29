package day28;
import java.util.ArrayList;

public class WarmUp {
	public static void main(String[] args) {
		ArrayList<Integer> lNum = new ArrayList<>();
		lNum.add(7);
		lNum.add(4);
		lNum.add(9);
		lNum.add(3);
		
		int sum = getFirstAndLast(lNum);
		System.out.println("Result: " + sum); // 10
		
		String[] arr = {"apple", "orange", "kiwi", "abc", "r"};
		ArrayList<Integer> lenList = getLengths(arr);
		
		//               [5] [6] [4] [3] [1]
		System.out.println(lenList);
	}
	
	public static ArrayList<Integer> getLengths(String[] strArr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (String str : strArr) {
			int len = str.length();
			list.add(len);
		}
		
		return list;
	}
	
	public static int getFirstAndLast(ArrayList<Integer> list) {
		return list.get(0) + list.get(list.size() - 1);
	}

}
