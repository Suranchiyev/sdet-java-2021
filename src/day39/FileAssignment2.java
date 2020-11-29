package day39;

import java.io.File;

public class FileAssignment2 {
	public static void main(String[] args) {
		File sdetFolder = new File("src/day39/sdet2");
		
//		boolean isDeleted = sdetFolder.delete();
//		System.out.println(isDeleted);
		
		if (sdetFolder.isDirectory()) {
			
			File[] files = sdetFolder.listFiles();
			
			for (File file : files) {
				file.delete();
			}		
			sdetFolder.delete();
			
		} else {
			sdetFolder.delete();
		}
	}
}
