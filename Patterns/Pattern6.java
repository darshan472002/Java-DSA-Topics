package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
//      Opposite of one Side Triangle in Number series format print
        Scanner p6 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p6.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= a-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
