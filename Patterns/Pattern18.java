package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner p18 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = p18.nextInt();

//        Striver Example
//        for (int i = 0; i <= n; i++){
//            for (char ch = (char) ('E' - i); ch <= 'E'; ch++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <= n; i++){
            int ch = 'A' + n - 1;
            for (int j = 1; j <= i; j++){
                System.out.print((char)ch-- + " ");
            }
            System.out.println();
        }
    }
}
