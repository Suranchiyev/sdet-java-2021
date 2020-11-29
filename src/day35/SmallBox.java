package day35;

import java.util.Arrays;

public class SmallBox implements Box {
	private String[] box = new String[5];
	private int numberOfItems;
	
	@Override
	public void put(String item) {
		box[numberOfItems] = item;
		numberOfItems++;
	}
	
	@Override
	public String get(int index) {
		return box[index];
	}
	
	@Override
	public int getFreeSpace() {
		return box.length - numberOfItems;
	}
	
	@Override
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	@Override
	public String getItems() {
		return Arrays.toString(box);
	}
	
}
