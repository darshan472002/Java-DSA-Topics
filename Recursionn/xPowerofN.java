package Recursionn;

import java.util.*;
import java.io.*;

public class xPowerofN {
	public static int calcPower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		else if (x == 0) {
			return 0;
		}
//		int xpowernm1 = calcPower(x, n-1);
//		int xpowernm1_n = x * xpowernm1;
//		return xpowernm1_n;
		
		// if n is even
				if (n % 2 == 0) {
					return calcPower(x, n/2) * calcPower(x, n/2);
				}
				// if n is odd
				else{
					return calcPower(x, n/2) * calcPower(x, n/2) * x;
				}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the 'x' value: ");
		int x = scn.nextInt();
		System.out.print("Enter the 'n' value: ");
		int n = scn.nextInt();
		int sum = calcPower(x, n);
		System.out.println("Calculate the 'x^n' value: " + sum);
	}

}
