package day9;

public class Book {
	public String title;
	public String author;
	public int pages;
	
	public void info() {
		System.out.println("Title:" + title);
		System.out.println("Author: " + author);
		System.out.println("Pages: " + pages);
	}
	
	public void read() {
		System.out.println("Reading.. " + title);
	}
}
