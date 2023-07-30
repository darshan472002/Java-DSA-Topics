package Recursionn;
import java.io.*;
import java.util.*;


public class DecreasingOrder {
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Decreasing Number: ");
        int n = scn.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
