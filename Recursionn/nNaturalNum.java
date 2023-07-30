package Recursionn;
import java.io.*;
import java.util.*;
// In hear I'm calculate the sum of first n natural numbers.

public class nNaturalNum {
	public static void printSum(int i, int n, int sum) {
		
		if(i == n) {
			sum = sum + i;
			System.out.println(sum);
			return; //?
		}
			
		sum = sum + i;
		printSum(i+1,n,sum);
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		int i = 1 , n = 5 , sum = 0;
		printSum(i,n,sum);
	}
}