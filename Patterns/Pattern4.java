package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
//      Half Triangle in Numbers Format print
        Scanner p4 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p4.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
