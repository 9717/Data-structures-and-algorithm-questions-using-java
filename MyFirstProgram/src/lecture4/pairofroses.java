package lecture4;

import java.util.*;

public class pairofroses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample Input:
//			2
//			2
//			40 40
//			80
//
//			5
//			10 2 6 8 4
//			10
//			Sample Output:
//			Deepak should buy roses whose prices are 40 and 40.
//			Deepak should buy roses whose prices are 4 and 6.
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j=0;j<t;j++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
		
    	
		int sum = s.nextInt();
		
		findmindiff(arr, arr.length, sum);
		}
		
	}
	public static void findmindiff(int[] arr,int n,int sum) {
		
		int leastdiff = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == sum) {
					int diff = Math.abs(arr[i] - arr[j]);
					if (diff < leastdiff) {
						leastdiff = diff;
						if (arr[i] < arr[j]) {
							a = arr[i];
							b = arr[j];
						} else {
							a = arr[j];
							b = arr[i];
						}
					}
				}

			}
		}
		System.out.println("Deepak should buy roses whose prices are "+a+" and "+b+".");
	}
	
}
