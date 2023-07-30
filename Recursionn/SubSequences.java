package Recursionn;

public class SubSequences {
	public static void subSequences(String str, int idx, String newString) {
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		// to be there
		subSequences(str, idx+1, newString + currChar);
		// not to be there
		subSequences(str, idx+1, newString);
	}

	public static void main(String[] args) {
		
		String str = "abcd";
		subSequences(str, 0, ""); // abcd, abc, acd, abd, bcd, ab, ac, ad, bc, bd, cd, a, b, c, d.
	}

}
