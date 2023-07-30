package Patterns;

public class Pattern20 {
    public static void main(String[] args) {
//        Scanner p18 = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = p18.nextInt();
        int n = 5;

        int space = 2*n-2;
        for (int i = 1; i <= 2*n-1; i++){
            int star = i;
            if (i > n) star = 2*n-i;
            // Star
            for (int j = 1; j <= star; j++){
                System.out.print("*");
            }

            // Space
            for (int j = 1; j <= space; j++){
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= star; j++){
                System.out.print("*");
            }
            System.out.println();
            if (i < n) space -= 2;
            else space += 2;
        }
    }
}
