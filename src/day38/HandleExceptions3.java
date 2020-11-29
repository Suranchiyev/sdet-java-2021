package day38;

public class HandleExceptions3 {
	public static void main(String[] args) {
		try {		
			//m(); 
			m1();	
			
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument exception");
			
		} catch (IndexOutOfBoundsException e1) {
			System.out.println("Runtime exception");
			
		} finally {
			// it will always execute. Does not matter if exception is thrown or not
			System.out.println("In finally block");
			// why do we need finally block?
			// to close resources or do clean up.
		}
		
		System.out.println("Here");
		
	}
	
	public static void m() {
		throw new IllegalArgumentException("from method m()");
	}
	
	public static void m1() {
		throw new RuntimeException("from method m1");
	}
}
