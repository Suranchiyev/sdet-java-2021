package day33;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car();
//		car.model = "";
//		car.price = 20000;
		car.setModel("Audi");
		car.setPrice(20000);
		
		System.out.println(car.getModel());
		System.out.println(car.getPrice());
	}
}
