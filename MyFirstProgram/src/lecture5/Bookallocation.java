package lecture5;

import java.util.*;

public class Bookallocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab = new Scanner(System.in);
		int t = ab.nextInt();
		while (t-- > 0) {
			int n = ab.nextInt();
			int m = ab.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = ab.nextInt();
			
			System.out.println(find(arr, n, m));
		}

	}

	public static int find(int arr[], int n, int m) {
		int start, end;
		start = end = 0;
		int result = Integer.MAX_VALUE;
		if (n < m)
			return -1;
		for (int i = 0; i < n; i++)
			end += arr[i];
		while (start <= end) {
			int mid = (start + end) / 2;
			if (isPossible(arr, n, m, mid)) {

				result = Math.min(result, mid);
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return result;
	}

	public static boolean isPossible(int arr[], int n, int m, int curr_min) {
		int i;
		int curr_sum = 0;
		int studentsRequired = 1;
		for (i = 0; i < n; i++) {
			if (arr[i] > curr_min)
				return false;

			if (curr_sum + arr[i] > curr_min) {
				studentsRequired++;
				curr_sum = arr[i];

				if (studentsRequired > m)
					return false;
			}

			else
				curr_sum += arr[i];
		}
		return true;
	}

}
