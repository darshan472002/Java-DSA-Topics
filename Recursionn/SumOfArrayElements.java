package Recursionn;
import java.io.*;
import java.util.*;

// Sum of given Integer from the array using Recursion.

public class SumOfArrayElements {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9};
        int sum = calculateSum(arr, arr.length);
        System.out.println(sum);

    }
    public static int calculateSum(int [] arr, int n) {
        if (n <= 0){
            return 0;
        }
        return calculateSum(arr, n - 1) + arr[n-1];
    }
}