package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
//        Half Triangle in star format print
        Scanner p2 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p2.nextInt();

        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
