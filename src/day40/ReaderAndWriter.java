package day40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
	public static void main(String[] args) {
		// Break till 9:12 PM EST
		
		File file = new File("src/day40/notes.txt");	
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {		
			String str;
			while ((str = reader.readLine()) != null) {	
				System.out.println(str); 
			}		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//==============
		
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Alex");
		list.add("Bek");
		list.add("Kuba");
		writeContent("src/day40/testFile.txt", list);
		
	}
	
	public static void writeContent(String path, List<String> content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			for (String line : content) {
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
