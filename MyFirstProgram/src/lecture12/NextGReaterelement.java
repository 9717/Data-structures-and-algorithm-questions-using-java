package lecture12;

import java.util.Scanner;
import java.util.Stack;

public class NextGReaterelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int j = 0; j < t; j++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			NGE2(arr,n);
		}
	}

	public static void NGE2(int[] arr, int n) {
		Stack<Integer> s = new Stack<Integer>();

		int arr1[] = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			while (!s.isEmpty() && s.peek() < arr[i])
				s.pop();

			if (s.empty())
				arr1[i] = -1;

			else
				arr1[i] = s.peek();

			s.push(arr[i]);
		}

		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + "," + arr1[i]);

	}
}
