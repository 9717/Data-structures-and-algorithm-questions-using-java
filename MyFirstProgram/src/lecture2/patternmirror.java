package lecture2;

import java.util.*;

public class patternmirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n/2;
		int row = 1;
		while (row <= n) {

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
				
			}
			
			System.out.println();
			if(row<=n/2) {
				nsp=nsp-1;
				nst=nst+2;
			}
			else {
				nsp=nsp+1;
				nst=nst-2;
			}
            row++;
		}

	}
}
