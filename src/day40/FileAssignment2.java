package day40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAssignment2 {
	public static void main(String[] args) {
		// Print names from names.txt file if only name length is even
		
		try (BufferedReader reader = new BufferedReader(new FileReader("src/day40/names.txt"))) {
			
			String line;
			while ((line = reader.readLine()) != null ) {
			    if (line.trim().length() % 2 == 0) {
			    	System.out.println(line);
			    }
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
