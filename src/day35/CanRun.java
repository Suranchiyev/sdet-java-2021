package day35;

public interface CanRun {
	public static final int MAX_RUN_HOURS = 10;
	int MAX_RUN_HEIGHT = 100; 
	// 'public static final' will be inserted by Java
	
	public abstract void run();
	
	void runFast(); // 'public abstract' will be inserted by Java
	
	// from Java 8
	// default method can have a body
	public default String getHello() {
		return "Hello";
	}
	
	// static method can have a body
	public static void sayHello() {
		System.out.println("Hello");
	}
}
