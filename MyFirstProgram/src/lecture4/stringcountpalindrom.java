package lecture4;

import java.util.Scanner;

public class stringcountpalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String a, b = "";
		// Scanner s = new Scanner(System.in);
		// int c=0;
		// a = s.nextLine();
		// int n = a.length();
		// for (int i = n; i >= 1; i--) {
		// for (int j = i - 1; j >= 1; j--) {
		// for (int k = i; k <= j; k++) {
		// System.out.println("");
		// }
		// c=c+1;
		// }
		// }
		// System.out.println(c);
		// System.out.println();
		int count = 0;
		Scanner s = new Scanner(System.in);
		String str = s.next();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				String original = str.substring(i, j);
				if (original.length() > 1) {

					String reverse = new StringBuffer(original).reverse().toString();
					if (original.equals(reverse)) {

						count++;

					}
				}

			}
		}

		System.out.println(count + str.length());
	}

}
