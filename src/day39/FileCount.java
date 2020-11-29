package day39;

import java.io.File;

public class FileCount {
	public static void main(String[] args) {
		System.out.println("Number of files: " + countFiles("src/day39"));
		
		String desktopPath = System.getProperty("user.home") + "/Desktop";
		System.out.println(desktopPath);
		System.out.println("Desktop: " + countFiles(desktopPath));
	}
	
	public static int countFiles(String path) {
		File folder = new File(path);
		
		if (folder.exists() && folder.isDirectory()) {
			File[] files = folder.listFiles();
			return files.length;
		} 
		return 0;
	}
}
