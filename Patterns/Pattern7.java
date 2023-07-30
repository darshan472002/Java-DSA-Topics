package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
//      Triangle format in star print
        Scanner p7 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p7.nextInt();

        for (int i = 1; i <= a; i++){
            // Spaces // n - i - 1
            for (int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= a-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
