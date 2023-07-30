package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner p16 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p16.nextInt();

        for (int i = 0; i <= a; i++){
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
