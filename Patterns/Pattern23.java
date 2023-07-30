package Patterns;

import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner p0 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p0.nextInt();

        for (int i = 0; i <= a; i++){
            // Spaces // n - i - 1
            for (int j = 0; j <= a-i; j++){
                System.out.print(" ");
            }

            // Character
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            // Character
            for (int j = i-1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
