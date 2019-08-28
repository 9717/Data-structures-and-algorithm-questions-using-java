package lecture5;

import java.util.Scanner;

public class MaximumcircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] ={8, -8, 9, -9, 10, -11, 12};
//		System.out.println(maxCircularSum(a));
//
//	}
//
//	public static int maxCircularSum(int[] a) {
//		int n = a.length;
//		int max = sum(a);
//		int maxvalue = 0;
//		for (int i = 0; i < n; i++) {
//			maxvalue += a[i];
//			a[i] = -a[i];
//
//		}
//		maxvalue = maxvalue + sum(a);
//		return (maxvalue > max) ? maxvalue : max;
//	}
//
//	private static int sum(int[] a) {
//		int n = a.length;
//		int max1 = 0, max2 = 0;
//		for (int i = 0; i < n; i++) {
//			max2 = max2 + a[i];
//			if (max2 < 0) {
//				max2 = 0;
//			}
//			if (max1 < max2);
//			{
//				max1 = max2;
//			}
//		}
//		return max1;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int N = s.nextInt();
			int a[] = new int[N];
			N = a.length;
			for (int j = 0; j < N; j++) {
				a[j] = s.nextInt();
			}

			System.out.println(maxCircularSum(a));
		}
	}

	public static int maxCircularSum(int[] a) {
		int total = 0, mins = 0, maxs = 0, mind = 0, maxd = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
			mins = Math.min(mins, total);
			maxs = Math.max(maxs, total);
			mind = Math.min(mind, total - maxs);
			mind = Math.max(maxd, total - mins);
		}
		return Math.max(maxd, total - mind);
	
	}

}
