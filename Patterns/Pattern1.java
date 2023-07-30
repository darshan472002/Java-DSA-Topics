package Patterns;

import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
//        Rectangle print
        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p1.nextInt();

        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
