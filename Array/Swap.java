package Array;

public class Swap {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        printArray(arr);
        int i;
        int j;
        mySwap(arr, i = 1, j = 4);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void mySwap(int arr[], int i, int j) {
        if (i > arr.length - 1 || i < 0)
            return;
        if (j > arr.length - 1 || j < 0)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
