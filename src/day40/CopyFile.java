package day40;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		copy("C:/Users/Beknazar/Desktop/Introduction_to_programmin.mp4", 
				"C:/Users/Beknazar/Desktop/copy.mp4");
		
	}

	public static void copy(String sourcePath, String targetPath) {
		File sourceFile = new File(sourcePath);
		File targetFile = new File(targetPath);
		
		if (!sourceFile.exists()) {
			throw new RuntimeException(sourcePath + " does not exist.");
		}
		
		try (InputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
				OutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))) {
			
			byte[] buffer = new byte[1024];
			
			int b;
			while((b = input.read(buffer)) != -1) {
				output.write(buffer, 0, b);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
