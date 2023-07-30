package Recursionn;

import java.io.*;
import java.util.*;

public class TowerofHanoi {
	public static void towerOfHanoi(int n, String src, String help, String des ) {
		if (n == 0) {
			return;
		}
		
		towerOfHanoi(n-1, src, help, des);
		System.out.println(n + "[" + src + " -> " + des + "]");
		towerOfHanoi(n-1, help, src, des);
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n = scn.nextInt();
		String src = scn.next();
		String help = scn.next();
		String des = scn.next();
		towerOfHanoi(n, src, help, des);
	}

}
