package Sorting;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner se = new Scanner(System.in);
        System.out.println("Enter how many elements you want? ");
        int n = se.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = se.nextInt();
        System.out.println("Enter the elements you want to search? ");
        int target = se.nextInt();
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println(target + " Found at this Placed " + (position + 1));
        } else {
            System.out.println("Element will no there in the sequence of the array");
        }
    }
}
