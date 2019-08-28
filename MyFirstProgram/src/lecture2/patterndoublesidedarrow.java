package lecture2;

import java.util.*;

public class patterndoublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = 1;
		int nsp = 2 * n - 2;
		int insp = 2;

		int row = 1;

		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = nst; cst >= 1; cst--) {
				System.out.print(cst + " ");
			}

			if (row > 1 && row < n) {
				for (int csp = 1; csp <= insp; csp++) {
					System.out.print(" ");
				}

				if (row <= n / 2) {
					insp += 4;
				} else {
					insp -= 4;
				}
			}

			int cst = 1;

			if (row == 1 || row == n) {
				cst = 2;
			}

			for (; cst <= nst; cst++) {
				System.out.print(cst + " ");
			}

			System.out.println();

			if (row <= n / 2) {
				nst += 1;
				nsp -= 4;
			} else {
				nst -= 1;
				nsp += 4;
			}

			row++;
		}

	}

}
