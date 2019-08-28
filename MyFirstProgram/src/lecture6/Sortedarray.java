package lecture6;

import java.util.Scanner;

public class Sortedarray {

	private static final String C = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] A = new int[n];
		int[] B = new int[m];
		for (int i = 0; i < n; i++) {
			A[i] = s.nextInt();
		}
		for (int j = 0; j < m; j++) {
			B[j] = s.nextInt();
		}
		int[] C = new int[A.length + B.length];
		generatesortedArrays(A, B, 0, 0, C, 0, true);

	}

	private static void generatesortedArrays(int[] A, int[] B, int ai, int bi, int[] C, int ci, boolean fromA) {
		// TODO Auto-generated method stub
		if (fromA) {
			if (ci != 0) {

				display(C, ci + 1);
			}

			for (int i = ai; i < A.length; i++) {
				if (ci == 0) {
					C[ci] = A[i];
					generatesortedArrays(A, B, i + 1, bi, C, ci, !fromA);
				} else if (A[i] > C[ci]) {
					C[ci + 1] = A[i];
					generatesortedArrays(A, B, i + 1, bi, C, ci + 1, fromA);
				}
			}
		} else {
			for (int i = bi; i < B.length; i++) {
				if (B[i] > C[ci]) {
					C[ci + 1] = B[i];
					generatesortedArrays(A, B, ai, i + 1, C, ci + 1, fromA);
				}
			}
		}
	}
        public static void display(int[] arr,int n) {
        	
        	for (int i = 0; i < n; i++) 
                System.out.print(arr[i] + " "); 
            System.out.println(""); 
	}

}
