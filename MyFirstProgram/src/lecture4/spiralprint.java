package lecture4;

import java.util.Scanner;

public class spiralprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m, n;
		m = sc.nextInt();
		n = sc.nextInt();

		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		spiralprint(arr);

	}

	public static void spiralprint(int[][] arr) {
		int left = 0, top = 0, right = arr[top].length - 1, bottom = arr.length - 1;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);
		while (left <= right && top <= bottom) {

			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + ", ");
					count--;
				}
				dir = 2;
				top++;
			}

			if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + ", ");
					count--;
				}
				dir = 3;
				right--;
			}

			if (dir == 3)

			{
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + ", ");
					count--;
				}

				dir = 4;
				bottom--;
			}

			if (dir == 4) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + ", ");
					count--;
				}
				dir = 1;
				left++;
			}

		}

		System.out.println("END ");
	}
}
