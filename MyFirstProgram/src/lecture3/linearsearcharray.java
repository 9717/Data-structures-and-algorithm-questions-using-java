package lecture3;

import java.util.Scanner;

public class linearsearcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = s.nextInt();
		int m = s.nextInt();
		// System.out.println(linearSearch(arr, m));
		//
		// }
		// public static int linearSearch(int[] arr, int data) {
		// Scanner s=new Scanner(System.in);
		//
		for (int i = 0; i < arr.length; i++) {
			// arr[i]=s.nextInt();
			if (arr[i] == m) {
				//System.out.println(m);
				System.out.println(i );
				break;
			}

		}
		// return -1;
	}

}
