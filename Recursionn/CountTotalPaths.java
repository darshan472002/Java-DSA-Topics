package Recursionn;

public class CountTotalPaths {

	public static int totalPaths(int i, int j, int n, int m) {
		if(i == n || j == m) {
			return 0;
		}
		
		if(i == (n-1) && j == (m-1)) {
			return 1;
		}
		
		// downwards move
		int downPaths = totalPaths(i+1, j, n, m);
		
		// right move
		int rightPaths = totalPaths(i, j+1, n, m);
		
		return downPaths + rightPaths;
	}
	
	public static void main(String[] args) {
		int n = 4, m = 4;
		int Calculate = totalPaths(0, 0, n, m);
		System.out.println(Calculate);
	}

}
