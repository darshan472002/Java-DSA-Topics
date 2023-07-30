package Recursionn;
import java.io.*;
import java.util.*;


public class IncreasingOrder {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Increasing Number: ");
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n == 0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
