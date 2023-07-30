package Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
//      Opposite Triangle format in star print
        Scanner p8 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p8.nextInt();

        for (int i = a; i >= 1; i--){
            // Spaces // n - i - 1
            for (int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
