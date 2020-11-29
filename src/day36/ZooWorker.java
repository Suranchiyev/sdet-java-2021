package day36;

public class ZooWorker {
	public static void main(String[] args) {
		Reptile reptile = new Reptile();
		feed(reptile);
		
		Reptile crocodile = new Crocodile();
		// System.out.println(crocodile.getName());	
		feed(crocodile); 
		
		Reptile alligator = new Alligator();
		feed(alligator);
		
		Crocodile c = new Crocodile();
		feed(c);
		
//		Reptile r = new Reptile();
//		getDetails(r);
	}
	
	public static void feed(Reptile reptile) {
		// reptile = c;
		// runtime polymorphism
		System.out.println(reptile.getName());
	}
	
	public static void getDetails(Alligator a) {
		System.out.println(a.getName());
	}
}
