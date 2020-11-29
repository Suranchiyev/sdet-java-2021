package day39;
import java.io.IOException;

public class ExceptionsReview {
	public static void main(String[] args) {
		
		// Break till 10:10 AM EST
		
		try {
			m(); 
			System.out.println("Hello");
			
		} catch (Exception e1) { 
			System.out.println("IOException is handled");
			
		} 
	}
	
	public static void m() throws Exception  {
		//throw new Exception("exception from m method");
		 throw new IOException("exception from m method");
		// throw new IllegalArgumentException();
	}
}
