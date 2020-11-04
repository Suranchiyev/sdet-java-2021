package day24;

public class String2 {
	private String str;
	
	public String2(String str) {
		this.str = str;
	}
	
	public String2 reverse() {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return new String2(rev);
	}
	
	public int length() {
		return str.length();
	}
	
	public char charAt(int index) {
		return str.charAt(index);
	}
	
	public int indexOf(char ch) {
		return str.indexOf(ch);
	}
	// other methods..
	
	public String toString() {
		return str;
	}
}
