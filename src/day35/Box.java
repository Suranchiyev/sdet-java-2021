package day35;

public interface Box {
	public abstract void put(String item);
	
	public abstract String get(int index);
	
	public abstract int getFreeSpace();
	
	public abstract int getNumberOfItems();
	
	public abstract String getItems();	
}
