package lecture4;

import java.util.Scanner;

public class waveprintcolwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		
		int [][] arr = new int [m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		wavePrint(arr);
	}
	public static void wavePrint(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			if (i%2==0) {
				for (int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i] + ", ");
				}
			} else {
				for (int j = arr.length-1; j >=0; j--) {
						System.out.print(arr[j][i] + ", ");

				}
			}
		}
		System.out.println("END");
    	 
    	 
    	 
    	 
  }

}
