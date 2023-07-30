package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner p15 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p15.nextInt();

        for (int i = 0; i <= a; i++){
            for (char j = 'A'; j <= 'A' + (a - i); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
