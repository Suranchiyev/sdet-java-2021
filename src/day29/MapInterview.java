package day29;
import java.util.HashMap;
import java.util.Map;

public class MapInterview {
	public static void main(String[] args) {
		String str = "hhehllo";
		Map<String, Integer> letters = countLetters(str);
		// {h = 1, e = 1, l = 2, o = 3}
		System.out.println(letters);
	}
	
	public static Map<String, Integer> countLetters(String str) {		
		Map<String, Integer> lM = new HashMap<>();
		for (char letter : str.toCharArray()) {
			String letterStr = String.valueOf(letter);
			if (lM.containsKey(letterStr)) {
				lM.put(letterStr, lM.get(letterStr) + 1);
			} else {
				lM.put(letterStr, 1);
			}
		}
		return lM;
	}
	
}
