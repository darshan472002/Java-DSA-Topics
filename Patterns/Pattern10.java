package Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
//        Half Diamond in star format print
        Scanner p10 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p10.nextInt();

        for (int i = 1; i <= 2*a-1; i++){
            int star = i;
            if(i > a)star =2*a-i;
            for (int j = 1; j <= star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
