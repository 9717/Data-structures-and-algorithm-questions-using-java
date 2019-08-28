package lecture1;

import java.util.Scanner;

public class fibn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// int n = 4; //scn.nextInt();
		//
		// int a = 0;
		// int b = 1;
		// int counter = 1;
		// for (int i = 0; i <= n; i++) {
		// for (int j = 0; j < i; j++) {
		// while (counter <= n ) {
		//
		// System.out.println(a);
		// int sum = a + b;
		// a = b;
		// b = sum;
		// counter++;
		//
		// }
		//
		// }
		// }
		int n = 4;
//		int a = 0, b = 1;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				int a=0,b=1;
				int c = 0;
				while (c <= n) {
					int sum = a + b;
					a = b;
					b = sum;
					c++;
					System.out.println(sum);
				}
				

			}

		}

	}
}