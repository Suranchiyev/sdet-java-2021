package day39;

import java.io.File;

public class FilePractice4 {
	public static void main(String[] args) {
		// List all files in specific directory
		File dir = new File("src/day39/sdet");
		
		if (dir.isDirectory()) {		
			File[] filesInside = dir.listFiles();
			for (File file : filesInside) {
				System.out.println(file.getName());
			}		
		} else {
			System.out.println("It is not a directory");
		}
	}
}
