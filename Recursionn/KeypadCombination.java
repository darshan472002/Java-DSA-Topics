package Recursionn;

import java.util.*;

public class KeypadCombination {
	public static String[] Keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void printCombination(String str, int idx, String combination) {
		if (idx == str.length()) {
			System.out.println(combination);
			return;
		}
		
		char currChar = str.charAt(idx);
		String mapping = Keypad[currChar - '0'];
		
		for (int i = 0; i < mapping.length(); i++) {
			printCombination(str, idx+1, combination + mapping.charAt(i));
		}
	}

	public static void main(String[] args) {
		String str = "23";
		printCombination(str, 0, "");
	}

}
