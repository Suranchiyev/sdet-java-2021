package day39;

import java.io.File;

public class DeleteHelper {
	public static void main(String[] args) {
		deleteAll("src/day39/tmpFolder");
	}
	
	public static void deleteAll(String path) {
		File root = new File(path);
		
		if (!root.delete()) {
			File[] files = root.listFiles();
			for (File file : files) {
				deleteAll(file.getAbsolutePath());
			}
			root.delete();
		}
		
		System.out.println(root.getAbsolutePath() + " DELETED");
	}
}
