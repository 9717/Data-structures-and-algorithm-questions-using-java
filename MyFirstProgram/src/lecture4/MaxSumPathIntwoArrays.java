package lecture4;

import java.util.Scanner;

public class MaxSumPathIntwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int p = s.nextInt();
		int q = s.nextInt();
		int[] ar1 = new int[p];
		int[] ar2 = new int[q];
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < p; i++) {
				ar1[i] = s.nextInt();
			}
			for (int j = 0; j < q; j++) {
				ar2[j] = s.nextInt();
			}

			int m = ar1.length;
			int n = ar2.length;
			System.out.println(maxPathSum(ar1, ar2, m, n));
		}
	}

	public static int maxPathSum(int ar1[], int ar2[], int m, int n) {

		int i = 0, j = 0;

		int result = 0, sum1 = 0, sum2 = 0;

		while (i < m && j < n) {

			if (ar1[i] < ar2[j]) {
				sum1 += ar1[i++];
			} else if (ar1[i] > ar2[j]) {
				sum2 += ar2[j++];
			}

			else {

				result += Math.max(sum1, sum2);

				sum1 = 0;
				sum2 = 0;

				while (i < m && j < n && ar1[i] == ar2[j]) {
					result = result + ar1[i++];
					j++;
				}
			}
		}

		while (i < m) {
			sum1 += ar1[i++];
		}

		while (j < n) {
			sum2 += ar2[j++];
		}

		result += Math.max(sum1, sum2);

		return result;
	}

}
