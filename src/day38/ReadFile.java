package day38;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		String path = "C:\\Users\\Beknazar\\Desktop\\doIT.txt";
		// BufferedReader br = new BufferedReader(new FileReader(path));
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			br.lines().forEach(l -> System.out.println(l));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}
}
