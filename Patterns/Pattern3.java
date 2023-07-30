package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
//        Half Triangle in Number format print
        Scanner p3 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p3.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
