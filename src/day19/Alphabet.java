package day19;

public class Alphabet {
	public static void main(String[] args) {
		String alphabet = ""; // "abc.."
		for (char current = 'A'; current <= 'Z'; current++) {
			alphabet += current;
		}
		System.out.println(alphabet);
		System.out.println("-----------");
		
		StringBuilder alphabetSb = new StringBuilder();
		for (char c = 'a'; c <= 'z'; c++) {
			alphabetSb.append(c);
		}
		System.out.println(alphabetSb);
	}
}
