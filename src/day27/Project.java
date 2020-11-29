package day27;

public class Project  {
	// your code goes here
   public static void main(String[] args) {
   	   String creditStr = args[0];
   	   System.out.println("Input form ter: " + creditStr);
   	   
       int[] cardArr = new int[creditStr.length()];
       for (int i = 0; i < creditStr.length(); i++) {
       	  cardArr[i] = Integer.parseInt(creditStr.charAt(i) + "");
       }
   }
}
