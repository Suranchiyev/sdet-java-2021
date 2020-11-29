package day34;

public class Country {
	public long population;
	public String capitalCity;
	
	public String str = "A";
	
	public Country() {
		System.out.println("From parent constructor");
	}
	
	public Country(String str) {
		System.out.println("From parent constructor with args");
	}
}
