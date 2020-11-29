package day28;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetChallenge {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);
		
		List<Integer> listNoDup = new ArrayList<>(); // [6, 3, 2, 7, 1]
		
		for (Integer number : list) {
			//  listNoDup if you dont have: 1 
			if (!listNoDup.contains(number)) {
				listNoDup.add(number);
			}
		}
		System.out.println(listNoDup);
		
		System.out.println("------------------");
		
		Set<Integer> set = new LinkedHashSet<>(list);
		List<Integer> listNoDup2 = new ArrayList<>(set);
		System.out.println(listNoDup2);
		
		System.out.println("-----------");
		String str = "hellooo"; // helo
		System.out.println(str);
		String noDupStr = "";
		//                  ['h']['e']['l']['l']['o']['o']['o']
		for (char letter : str.toCharArray()) {
			//    "o"                           'o'
			String letterStr = String.valueOf(letter);
			//      "helo"                "o"
			if (!noDupStr.contains(letterStr)) { // if does not contain then true
				// "helo"
				noDupStr += letterStr;
			}
		}
		//     "helo"
		str = noDupStr;
		System.out.println(str);
		
	}
}


