package day40;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
	public static void main(String[] args) {
		File file = new File("src/day40/notes.txt");
		
		// try catch with resources
		// it will automatically close the resources
		try (InputStream in = new FileInputStream(file)) {
			
			int b;
			while ((b = in.read()) != -1) {
				System.out.print((char)b);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}
}
