package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner p12 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p12.nextInt();
        int space = 2* (a-1);

        for (int i = 1; i <= a; i++){
            // Numbers
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            // Space
            for (int j = 1; j <= space; j++){
                System.out.print(" ");
            }

            // Numbers
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
}
