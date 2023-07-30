package Recursionn;

import java.util.HashSet;

public class UniqueSequences {
	public static void uniqueSequences(String str, int idx, String newString, HashSet<String> set) {
		if (idx == str.length()) {
			if (set.contains(newString)) {
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		
		char currChar = str.charAt(idx);
		// to be
		uniqueSequences(str, idx+1, newString + currChar, set);
		// to not be
		uniqueSequences(str, idx+1, newString, set);
	}
	
	public static void main(String[] args) {
		String str = "abcbac";
		HashSet<String> set = new HashSet<>();
		uniqueSequences(str, 0, "", set);
	}

}
