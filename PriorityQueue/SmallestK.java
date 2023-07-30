package PriorityQueue;

import java.util.*;

public class SmallestK {
    static void kSmallest(int a[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        for (int i = 0; i < n; ++i) {

            pq.add(a[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
    }

    public static void main(String[] args) {
        int a[] = { 12, 13, 14, 15, 1, 2, 3 };
        int n = a.length;
        int k = 3;
        System.out.print("Smallest Elements are : ");
        kSmallest(a, n, k);
    }
}