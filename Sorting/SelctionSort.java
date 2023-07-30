package Sorting;

class SelctionSort {
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}

	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2, 9 };
		int n = arr.length;

		//Selction Sort
		for (int i=0; i<n-2; i++) {
			int smallest = i;
			for (int j=i; j<n-1; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);

	}

}
