package lecture5;

import java.util.*;

public class AlexGoesforshopping {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		Integer[] arr1 = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
		}
		int[] arr2 = new int[m];
		for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
			arr2[pendrives_i] = in.nextInt();
		}

		Arrays.sort(arr1, Collections.reverseOrder());
		Arrays.sort(arr2);

		int max = -1;
		for (int i = 0, j = 0; i < n; i++) {
			for (; j < m; j++) {
				if (arr1[i] + arr2[j] > s)
					break; // This prevents j from incrementing
				if (arr1[i] + arr2[j] > max)
					max = arr1[i] + arr2[j];
			}
		}
		System.out.println(max);

	}

}
