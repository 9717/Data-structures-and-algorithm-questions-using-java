package lecture4;

import java.util.Scanner;

public class Maxfrequencycharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		printMaxOccuringChars(str);

	}

	static void printMaxOccuringChars(String str) {
		char[] arr = str.toCharArray();

		int[] arr1 = new int[256];
		int maxoccuring = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				int val = (int) arr[i];
				arr1[val]++;
				if (arr1[val] > maxoccuring) {
					maxoccuring = arr1[val];
				}
			}

		}

		for (int k = 0; k < arr1.length; k++) {
			if (maxoccuring == arr1[k]) {
				char c = (char) k;
				System.out.print(c + " ");

			}

		}
	}

}
