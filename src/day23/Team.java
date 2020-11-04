package day23;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		String[][] teams = {
				{"Ylduz", "Mark", "Akylbek", "Daniel"}, 
				{"Ariunna", "Frank", "Nurgazy", "Anna"}, 
				{"Selvin", "Meerim", "Gulzhana", "Rocio"}, 
				{"Job", "Evelyn", "Edil", "Aizhamal"},
				{"Vlad"}
				};
		System.out.println(teams[1][1]);
		System.out.println(Arrays.deepToString(teams));
		
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				teams[i][j] = "John";
			}
		}
		
		System.out.println(Arrays.deepToString(teams));
		
	}
}
