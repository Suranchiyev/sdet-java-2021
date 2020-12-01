package day40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileAssignment {
	public static void main(String[] args) {
		// 1. There is text file with some content 
		// 2. Write a code that will count number of words in this file
		
		// 1. We need to read content
		// 2. Split by space 
		
		String content = getContent("src/day40/article.txt");
		String[] words = content.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		int counter = 0;
		for (String word : words) {
			if (word.length() == 0) {
				continue;
			}
			
			counter++;
		}
		
		System.out.println(counter);
	}
	
	public static String getContent(String path) {
		StringBuilder sb = new StringBuilder();
	
		File file = new File(path);
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
