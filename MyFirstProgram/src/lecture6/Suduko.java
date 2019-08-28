package lecture6;

import java.util.Scanner;

public class Suduko {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		suduko(arr, n, 0, 0);
	}

	public static void suduko(int[][] arr, int n, int row, int col) {
		if (row == n) {
			display(arr, n);
			return;
		}
		if (col == arr[row].length) {
			suduko(arr, n, row + 1, 0);
			return;
		}
		if (arr[row][col] != 0) {
			suduko(arr, n, row, col + 1);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (ispossible(arr, n, row, col, i)) {
					arr[row][col] = i;
					suduko(arr, n, row, col + 1);
					arr[row][col] = 0;
				}
			}
		}

	}

	public static boolean ispossible(int[][] arr, int n, int row, int col, int num) {

		for (int i = 0; i < n; i++) {
			if (arr[i][col] == num)
				return false;
		}
		for (int i = 0; i < n; i++) {
			if (arr[row][i] == num)
				return false;
		}
		int sqrt = 3;
		int rowstart = row - (row % sqrt);
		int colstart = col - (col % sqrt);
		for (int i = rowstart; i < rowstart + sqrt; i++) {
			for (int j = colstart; j < colstart + sqrt; j++) {
				if (arr[i][j] == num)
					return false;
			}
		}
		return true;
	}

	public static void display(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
