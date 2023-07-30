package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
//        Scanner p18 = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = p18.nextInt();
        int n = 5;

        // Upper half
        for (int i=1; i<=n; i++) {
            // Stars
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            // Spaces
            for (int j=2; j<=2*i-1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i=n; i>=1; i--) {
            // Stars
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            // Spaces
            for (int j=2; j<=2*i-1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
