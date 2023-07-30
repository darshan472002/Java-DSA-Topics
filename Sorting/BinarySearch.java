package Sorting;
import java.util.*;
import java.io.*;

public class BinarySearch {

	public static int binarySearch(int [] arr ,int x) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == x) {
				System.out.println("Element found at Index: " + mid);
				break;
			} else if (arr[mid] < x) {
				left = mid + 1;
			} else if (arr[mid] > x) {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Binary Number: ");
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter that Number which you find? ");
		int x = scn.nextInt();
		binarySearch(arr, x);
	}
}