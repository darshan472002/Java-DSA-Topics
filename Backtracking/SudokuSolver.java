package Backtracking;

import java.util.Scanner;

public class SudokuSolver {

	public static boolean solveSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {

					for (char c = '1'; c <= '9'; c++) {
						if (isValid(board, i, j, c)) {
							board[i][j] = c;

							if (solveSudoku(board))
								return true;
							else
								board[i][j] = '.';
						}
					}

					return false;
				}
			}
		}
		return true;
	}


	public static boolean isValid(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == c)
				return false;

			if (board[row][i] == c)
				return false;

			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		char[][] board= {
				{'9', '.', '2', '.', '5', '.', '.', '1', '8'},
				{'.', '.', '6', '.', '.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '4', '.', '.', '5'},
				{'8', '.', '9', '.', '.', '3', '2', '.', '.'},
				{'.', '6', '.', '.', '9', '.', '.', '.', '.'},
				{'.', '4', '.', '.', '.', '.', '.', '8', '.'},
				{'.', '8', '.', '.', '.', '.', '.', '.', '.'},
				{'1', '.', '5', '.', '4', '.', '.', '2', '.'},
				{'.', '.', '.', '7', '.', '.', '3', '.', '.'}
		};
		solveSudoku(board);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}
}

