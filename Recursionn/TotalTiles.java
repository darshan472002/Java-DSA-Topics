package Recursionn;

public class TotalTiles {
	public static int totalTiles(int n, int m) {
		if(n == m) {
			return 2;
		}
		if(n < m) {
			return 1;
		}
		
		// Vertically Placed
		int verticalPlace = totalTiles(n-m, m);
		
		// Horizontally Placed
		int horizontalPlace = totalTiles(n-1, m);
		
		return verticalPlace + horizontalPlace;
	}
	
	public static void main(String[] args) {
		int n = 4, m = 3;
		int Calculate = totalTiles(n, m);
		System.out.println(Calculate);
	}

}
