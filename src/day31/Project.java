package day31;

public class Project  {
	public static void main(String[] args) {
    	String card = "378282246310005";
        if (isValidByLA(card)) {
           // your code goes here
        } else {
        	System.out.println("INVALID");
        }
    }
  
  	public static boolean isValidByLA(String card) {
		char[] letters = card.toCharArray();
      
        String tmp = "";
        for (int i = letters.length - 2; i >= 0; i -= 2) {
        	tmp +=  Integer.parseInt(String.valueOf(letters[i])) * 2;
        }
        
        int sum = 0;
        for (char ch : tmp.toCharArray()) {
        	System.out.println(ch);
        	sum += Integer.parseInt(String.valueOf(ch));
        }
        
        for (int i = letters.length - 1; i >= 0; i -= 2) {
        	sum += Integer.parseInt(String.valueOf(letters[i]));
        }
        
        System.out.println(sum);
        
        return sum % 10 == 0;
    }
}
