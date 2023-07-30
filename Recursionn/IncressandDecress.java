package Recursionn;
import java.io.*;
import java.util.*;


public class IncressandDecress {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Increasing and Decreasing Number: ");
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
