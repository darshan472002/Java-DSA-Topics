package Recursionn;

import java.util.*;
import java.io.*;

public class MoveallXs {
	public static void moveAllXs(String str, int idx, int count, String newString) {
		if(idx == str.length()) {
			for (int i = 0; i < count; i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		if (currChar == 'x') {
			count++;
			moveAllXs(str, idx+1, count, newString);
		}else {
			newString += currChar;
			moveAllXs(str, idx+1, count, newString);
		}
	}

	public static void main(String[] args) {
		String str = "axbcxdxx";
		moveAllXs(str, 0, 0, "");
	}

}
