package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner p17 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = p17.nextInt();

        for (int i = 0; i <= n; i++){
            // Spaces // n - i - 1
            for (int j = 0; j <= n-i-1; j++){
                System.out.print(" ");
            }

            // Character
            char ch = 'A';
            int k = (2*i+1) / 2;
            for (int j = 1; j <= 2*i+1; j++){
                System.out.print(ch);
                if (j <= k) ch++;
                else ch--;
            }

            // Spaces // n - i - 1
            for (int j = 0; j <= n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
