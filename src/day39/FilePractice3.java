package day39;
import java.io.File;
import java.io.IOException;

public class FilePractice3 {
	public static void main(String[] args) throws IOException {
		// 1. Create a directory 'sdet'
		// 2. oop.pdf, slides.pdf, cat.png, ccfa.txt
		
		File dir = new File("src/day39/sdet");
		if (!dir.exists()) {
			// mdkdir is to create a directory/folder
			System.out.println("New folder");
			dir.mkdir();
		}
		
		String absPath = dir.getAbsolutePath();
		System.out.println("Folder path: " + absPath);
		
		File f1 = new File(absPath + "/oop.pdf");
		f1.createNewFile();
		
		File f2 = new File(absPath + "/slides.pdf");
		f2.createNewFile();
		
		File f3 = new File(absPath + "/cat.png");
		f3.createNewFile();
		
		File f4 = new File(absPath + "/ccfa.txt");
		f4.createNewFile();
	}
}
