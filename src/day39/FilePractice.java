package day39;
import java.io.File;

public class FilePractice {
	public static void main(String[] args) {
		File myFile = new File("src/day39/testFile.txt");
		
		System.out.println("File exists: " + myFile.exists());
		System.out.println("File name: " + myFile.getName());
		System.out.println("Path: " + myFile.getAbsolutePath());
		
		System.out.println("Is it file: " + myFile.isFile());
		System.out.println("Is it folder: " + myFile.isDirectory());
		
		System.out.println("Size: " + myFile.length() + " BYTES");
		
		// epoch 
		System.out.println("Last modified: " + myFile.lastModified());
		
		File day39Dir = new File("src/day39");
		System.out.println("Is folder: " + day39Dir.isDirectory());
	}
}
