package Sorting;

class InsertionSort {
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		int n = arr.length;

		//Insertion Sort
		
		// for (int i=1; i<n; i++) {
		// 	int current = arr[i];
		// 	int j = i-1;
		// 	while(j >= 0 && current < arr[j]) {
		// 		arr[j+1] = arr[j];
		// 		j--;
		// 	}
		// 	//Placement
		// 	arr[j+1] = current;
		// }

		for (int i = 0; i <= n - 1; i++) {
			int j = i;
			while (j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		printArray(arr);
	}

}
