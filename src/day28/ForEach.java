package day28;
import java.util.ArrayList;

public class ForEach {
	public static void main(String[] args) {
		ArrayList<Integer> listNum = new ArrayList<>();
		listNum.add(98);
		listNum.add(67);
		listNum.add(54);
		
		                     // [98] [67] [54]
		for (Integer n : listNum) {
			System.out.println(n);
		}
		
		String[] strArr = {"a", "b", "c", "d"};
		for (String str : strArr) {
			System.out.println(str);
		}
		
		for (int i = 0; i < strArr.length; i++) {
			String str = strArr[i];
			System.out.println(str);
		}
		
		ArrayList<Boolean> bL = new ArrayList<>();
		bL.add(false);
		bL.add(true);
		bL.add(false);
		bL.add(true);
		
		for (Boolean b : bL) {
			System.out.println(b);
		}
	}
}
