package Recursionn;
import java.io.*;
import java.util.*;

// Print the factorial of a number n.

public class FactorialNo {
	public static int calculateFact(int n) {

		if(n == 1 || n == 0) {   // base case to stop the function cycle.
			return 1;
		}
		
		int fact = calculateFact(n-1);  // here function will be give the n-1 number for calculate the factorial.
		int fact_n = n * fact;     // here n * (n-1) will be perform 
		return fact_n;       // return the value calculated
		
	}
	
	public static void main (String args[]) {
		
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the Factorial value: ");
		int n = sn.nextInt();
		int sum = calculateFact(n); // call the function here for sum
		System.out.println(sum);

		
		// this bottom code will be work on the main class 
//		int n = 10, sum = 1;
//		 for(int i = 1; i <= n; i++) {
//			 sum *= i;
//		 }
//		 System.out.println("The Factorial of " + n + " is: " + sum);
		
	}

}
