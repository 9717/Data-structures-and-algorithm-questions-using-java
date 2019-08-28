package lecture5;

import java.util.*;

public class ARRAYSTARGETSUMPAIRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = s.nextInt();
		}
		int sum = s.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {
					if(arr[i]<arr[j]) {
					System.out.println(arr[i] + " and " + arr[j]);
					}
					else {
						System.out.println(arr[j] + " and " + arr[i]);
					}
				}

			}
		}
		System.out.println();
	}

}
