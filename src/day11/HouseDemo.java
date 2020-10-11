package day11;

public class HouseDemo {
	public static void main(String[] args) {
		House houseOne = new House();
		System.out.println(houseOne);
		houseOne.address = "67 Bank St";
		System.out.println(houseOne.address);
		
		House houseTwo = houseOne;
		System.out.println(houseTwo.address);
		houseTwo.address = "45 West St";
		System.out.println(houseOne.address); 
		System.out.println(houseTwo.address);
		
		House houseThree = new House();
		System.out.println(houseThree.address);
		
		houseThree = houseOne;
		System.out.println(houseThree.address);  // 45 West St                       
		
	}
}
