package Patterns;

import static java.util.Collections.min;

public class Pattern22 {
    public static void main(String[] args) {
//        Scanner p18 = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = p18.nextInt();
        int n = 4;

        for (int i = 0; i < 2*n-1; i++){
            for (int j = 0; j < 2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}
