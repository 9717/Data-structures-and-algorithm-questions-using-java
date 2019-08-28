package lecture5;

import java.util.Scanner;

public class RainWater {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int j = 0; j < t; j++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(findWater(n,arr));

		}

	}

	private static int findWater(int n,int[] arr) {
		int left[] = new int[n];

		int right[] = new int[n];

		int water = 0;

		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], arr[i]);

		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		for (int i = 0; i < n; i++)
			water += Math.min(left[i], right[i]) - arr[i];

		return water;
	}
}
