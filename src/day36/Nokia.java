package day36;

public class Nokia implements Phone {
	@Override
	public void call() {
		System.out.println("Call from nokia");
	}
	
	@Override
	public int getPhoneNumber() {
		return 1235346272;
	}
	
	public static void main(String[] args) {
		Nokia obj = new Nokia();
		obj.call();
		System.out.println(obj.getPhoneNumber());
	}
}
