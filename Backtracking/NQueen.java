package Backtracking;

public class NQueen {	

	static final int N = 4;
	
// print the final solution matrix 
	static void printSolution(char[][] board)
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}
	
// function to check whether the position is safe or not 
	static boolean isSafe(char [][] board, int row, int col)
	{
		//horizontal
	       for(int j=0; j<board.length; j++) {
	           if(board[row][j] == 'Q') {
	               return false;
	           }
	       }
	      
	       //vertical
	       for(int i=0; i<board.length; i++) {
	           if(board[i][col] == 'Q') {
	               return false;
	           }
	       }
	      
	       //upper left
	       int r = row;
	       for(int c=col; c>=0 && r>=0; c--, r--) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       //upper right
	       r = row;
	       for(int c=col; c<board.length && r>=0; r--, c++) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       //lower left
	       r = row;
	       for(int c=col; c>=0 && r<board.length; r++, c--) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       //lower right
	       for(int c=col; c<board.length && r<board.length; c++, r++) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       return true;
	}
	
// The function that solves the problem using backtracking 
	public static boolean solveNQueen(char[][] board, int col)
	{
		if (col >= N)
			return true;
		
		for (int i = 0; i < N; i++) {
			//if it is safe to place the queen at position i,col -> place it
			if (isSafe(board, i, col)) {
				board[i][col] = 'Q';
				
				if (solveNQueen(board, col + 1))
					return true;
				
				//backtrack if the above condition is false
				board[i][col] = '0';
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		char[][] board = { { '0', '0', '0', '0' },
				{ '0', '0', '0', '0' },
				{ '0', '0', '0', '0' },
				{ '0' , '0', '0', '0' } };
		
		if (!solveNQueen(board, 0)) {
			System.out.print("Solution does not exist");
			return;
		}
		
		printSolution(board);
		
	}
}