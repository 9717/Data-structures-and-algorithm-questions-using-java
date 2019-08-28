package lecture5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class aggresivecow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int c = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		System.out.println(func(n, c, s));

	}

	public static int func(int n, int c, int[] s) {
		Arrays.sort(s);
		int start = 0;
		int end = s[n - 1]-s[0];
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (isValid(n, c, s, mid)) {
				ans = mid;
				start=mid+1;
			} else {
				end = mid - 1;
			}

		}
		return ans;
	}

	public static boolean isValid(int n, int c, int[] s, int value) {
		int cs = s[0];
		int cow = 1;
		for (int i = 0; i < n; i++) {
			if (s[i] - cs >= value) {
				cs = s[i];
				cow++;
			}
			if (cow == c)
				return true;
		}
		return false;
	}
}
