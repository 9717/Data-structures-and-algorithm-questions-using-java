package lecture2;
import java.util.Scanner;
public class patternhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// row
		int row = 1;
		int nr = 2 * n + 1;
		// work
		int nst = 2 * n + 1;
		int nsp = 0;
		// value
		int val;
		while (row <= nr) {

			// work space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			// value
			if (row <= nr / 2 + 1) {
				val = n + 1 - row;
			} else {
				val = row + n - nr;
			}
			// work stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(" "+ val );
				if (cst <= nst / 2) {
					val--;
				} else {
					val++;
				}

			}

			// preparation
			if (row <= nr / 2) {
				nsp++;
				nst = nst - 2;
			} else {
				nsp--;
				nst = nst + 2;
			}
			System.out.println();
			row++;
		}
		 
	}

}
