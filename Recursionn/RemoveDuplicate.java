package Recursionn;

public class RemoveDuplicate {
	public static boolean[] map = new boolean[26];
	
	public static void removeDuplicates(String str, int idx, String newString) {
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		if (map[currChar - 'a']) {
			removeDuplicates(str, idx+1, newString);
		}else {
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDuplicates(str, idx+1, newString);
		}
	}

	public static void main(String[] args) {
		// currChar - 'a' = -> give the MAP INDEX
		// currChar -> is true so not add in newString
		// currChar -> is false so add in newString and map[pos] = true
		String str = "abbcdda";
		removeDuplicates(str, 0, "");
		
	}

}
