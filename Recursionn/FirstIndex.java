package Recursionn;
import java.io.*;
import java.util.*;

public class FirstIndex {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 6, 7, 8, 9, 5, 6, 7, 8, 9, 1, 2 };
    System.out.println("----------------------------------");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n----------------------------------");

    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the Data Which you are find? ");
    int d = scn.nextInt();
    int fi = firstIndex(arr, 0, d);
    System.out.println(fi);
  }

  public static int firstIndex(int[] arr, int idx, int x) {
    if (idx == arr.length) {
      return -1;
    }

    if (arr[idx] == x) {
      return idx;
    } else {
      int fiisa = firstIndex(arr, idx + 1, x);
      return fiisa;
    }
  }
}
