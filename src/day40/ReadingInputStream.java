package day40;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingInputStream {
	public static void main(String[] args) {
		File myFile = new File("src/day40/notes.txt");
		
		InputStream in = null;
		try {
			in = new FileInputStream(myFile);
			int b;
			
			while ((b = in.read()) != -1) {
				// exception 
				System.out.print((char)b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
