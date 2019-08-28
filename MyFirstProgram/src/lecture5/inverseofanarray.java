package lecture5;
import java.util.*;
public class inverseofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample Input:
//			4
//			1
//			0
//			2
//			3
//			Sample Output:
//			1 0 2 3
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = s.nextInt();
		}
		int[] arr2=new int[m];
		 for (int i = 0; i <arr.length; i++) {
		       int index=i;
		       int res=arr[i];
		       arr2[res]=index;
		    }
		  for (int i = 0; i <m; i++) {
		        System.out.print(arr2[i]+" ");
		      
		    }
		  System.out.println();
	}

}
