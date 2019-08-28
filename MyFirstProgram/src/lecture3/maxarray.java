package lecture3;
 import java.util.Scanner;
public class maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = { 10, 20, 30, 40, 50 };
//		System.out.println(max(a));
//	}
//
//	public static int[] max(int[] a) {
//		{   int max=Integer.MIN_VALUE;
//			for (int i = 0; i < a.length; i++) {
//				if (a[i] > a[i + 1]) {
//                       max=a[i];
//	    
//				}
//
//			}
//
//		}
//		return a;
		   Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	      int[] arr = new int[n];
//	      System.out.println(max(arr));
//	    }
//	    public static int max(int[] arr) {
//	    	 Scanner s=new Scanner(System.in);
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				 arr[i]=s.nextInt();
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println(max);
	}
}
