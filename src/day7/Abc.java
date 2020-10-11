package day7;

public class Abc {

	public static void main(String[] args) {

    // Main steps
		page1("Oleksii", "Nikitemko", 36);
    page2("Johen", "Don", 67);

	}

   // block of instuctions
   public static void page1(String firstName, String lastName, int age) {
      System.out.println("Firts mname: " + firstName);
      System.out.println("lastName: " + lastName);
      System.out.println("Age: " + age);
   }

   // block of instuctions
   public static String page2(String firstName, String lastName, int age) {
   	  System.out.println("Firts mname: " + firstName);
      System.out.println("lastName: " + lastName);
      System.out.println("Age: " + age);
      return "";
	 }

}