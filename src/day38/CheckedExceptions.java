package day38;

public class CheckedExceptions {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
			// waitSec(); checked exception here
		}
	}
	// 1. RuntimeException - it's not required to handle it
	// 2. CheckedExcpetions - we must handle it.
	
	// We can handle checked exceptions in two ways:
	// 1. using try catch 
	// 2. we declare exception in the method signature with 'throws keyword'
	//    
	public static void waitSec() throws Exception {
		Thread.sleep(1000);
	}
}
