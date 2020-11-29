package day35;

public class Child extends Parent {
	
	@Override
	public void methodOne() {
		System.out.println("Good morning!");
	}
	
	@Override
	public String methodTwo() {
		return "Orange";
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.methodOne();
		System.out.println(obj.methodTwo());
		System.out.println("------");
		
		Parent obj1 = new Parent();
		obj1.methodOne();
		System.out.println(obj1.methodTwo());
		
		Child obj2;
		obj2 = new Child();
		
	}
}
