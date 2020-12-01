package day40;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class WriteByteStream {
	public static void main(String[] args) throws IOException {
		File file = new File("src/day40/test.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try (OutputStream out = new FileOutputStream(file)) {		
			out.write(72);
			out.write(73);
			out.write(122);
			out.write(123);			
			out.flush(); // save current progress 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


