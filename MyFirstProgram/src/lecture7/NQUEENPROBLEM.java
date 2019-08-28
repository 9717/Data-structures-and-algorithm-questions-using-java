package lecture7;

public class NQUEENPROBLEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		System.out.println(countNQueens(board, 0));
		
		
		
	}
		public static int countNQueens(boolean[][] board, int row) {
			if (row == board.length) {
				return 1;
			}
			int count = 0;
			for (int col = 0; col < board[row].length; col++) {
				if (isItSafe(board, row, col)) {
					board[row][col] = true;
					count = count + countNQueens(board, row + 1);
					board[row][col] = false;
				}
			}
			return count;
		}

		public static boolean isItSafe(boolean[][] board, int row, int col) {
			for (int i = row; i >= 0; i--) {
				if (board[i][col]) {
					return false;
				}
			}

			for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
				if (board[i][j]) {
					return false;
				}
			}

			for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
				if (board[i][j]) {
					return false;
				}
			}

			return true;
		}

		public static void printAllPathsWithMine(int[][] arr, int cr, int cc, int er, int ec) {
			if (er == cr && ec == cc) {
				arr[cr][cc] = 1;
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println("*********************");
				arr[cr][cc] = 0;
				return;
			}
			if (cr > er || cc > ec) {
				return;
			}
			if (arr[cr][cc] == 9) {
				return;
			}

			arr[cr][cc] = 1;
			printAllPathsWithMine(arr, cr, cc + 1, er, ec);
			printAllPathsWithMine(arr, cr + 1, cc, er, ec);
			arr[cr][cc]=0;

	}

}
