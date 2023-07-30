package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
//      Diamond format in star print
        Scanner p9 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p9.nextInt();

//        Triangle
        for (int i = 1; i <= a; i++){
            // Spaces // n - i - 1
            for (int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        Opposite Triangle
        for (int i = a; i >= 1; i--){
            // Spaces // n - i - 1
            for (int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
