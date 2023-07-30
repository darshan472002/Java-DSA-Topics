package Patterns;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
//        Scanner p0 = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int a = p0.nextInt();
        int n = 5;

        for (int i = 0; i <= n; i++){
            // Spaces // n - i - 1
            for (int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }

            // first part
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }

            // second part
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
