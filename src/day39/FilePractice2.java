package day39;

import java.io.File;
import java.io.IOException;

public class FilePractice2 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/day39/notes.txt");
		
		if (file.exists()) {
			System.out.println("File is exist");
			System.out.println(file.getName());
		} else {
			System.out.println("File is not exist");
			file.createNewFile();
		}
		
//		boolean isDel = file.delete();
//		if (isDel) {
//			System.out.println("Deleted: " + file.getAbsolutePath());
//		}
	}
}
