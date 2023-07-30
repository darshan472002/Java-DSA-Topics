package Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner p14 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p14.nextInt();

        for (int i = 0; i <= a; i++){
            for (char j = 'A'; j <= 'A' + i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
