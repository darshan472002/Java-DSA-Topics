package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
//        Half Triangle in star format print
        Scanner p11 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = p11.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
