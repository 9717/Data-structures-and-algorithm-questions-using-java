package lecture3;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = s.nextInt();
		  int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = arr[i]; 
	            j = j - 1; 
	        } 
	        for (int k = 0; k < n; k++) { 
	            System.out.println(b[k]); 
	        } 
	}

}
