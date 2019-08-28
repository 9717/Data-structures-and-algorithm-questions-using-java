package lecture4;
import java.util.*;
public class waveprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
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
		for (int i = 0; i < arr.length; i++) {
			if (i %2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.println("END");
    	 
    	 
    	 
     }
}
