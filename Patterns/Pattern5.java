package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
//      Opposite of one Side Triangle in star format print
        Scanner p5 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p5.nextInt();

        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= a-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
