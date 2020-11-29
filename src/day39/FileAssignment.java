package day39;

import java.io.File;
import java.io.IOException;

public class FileAssignment {
	public static void main(String[] args) {
		// TODO Create three files under 'tmpFolder' folder in day39 folder
		// 1. create folder 'tmpFolder'
		// 2. Create files under this folder:
		// names.txt
		// phoneNumber.pdf
		// notes.txt
		
		// File for directory
		// mkdir() 
		// File for each file
		// createNewFile()
		
		// Lunch break till 1 PM EST
		
		File tmpDir = new File("src/day39/tmpFolder");
		tmpDir.mkdir();
		
		File f1 = new File(tmpDir.getAbsolutePath() + "/names.txt");
		File f2 = new File(tmpDir.getAbsolutePath() + "/phoneNumber.pdf");
		File f3 = new File(tmpDir.getAbsolutePath() + "/notex.txt");
		
		try {
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
