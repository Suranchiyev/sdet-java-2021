package day39;

import java.io.File;

public class FileCount2 {
	private static int count = 0;
	
	public static int countFiles(String path) {
		File rootDir = new File(path);
		if (rootDir.isDirectory()) {
			
			File[] files = rootDir.listFiles();
			
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						count++;
					} else {
						countFiles(file.getAbsolutePath());
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String desktopPath = System.getProperty("user.home") + "/Desktop";
		System.out.println(countFiles("c:/Users/Beknazar/Desktop"));
	}
}
