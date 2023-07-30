package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner p13 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p13.nextInt();
        int b = p13.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}
