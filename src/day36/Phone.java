package day36;

public interface Phone {
	
	public abstract void call();
	
	public abstract int getPhoneNumber();
	
	public default void dMethod() {
		System.out.println("Default method");
	}
	
	public static int getRandomNumber() {
		return 7;
	}
}
