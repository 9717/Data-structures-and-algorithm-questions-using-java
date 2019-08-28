package lecture5;

import java.util.Scanner;

public class arraytargetsumtriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner s=new Scanner(System.in);
		// int m=s.nextInt();
		// int[] arr=new int[m];
		// for (int i = 0; i < m; i++) {
		// arr[i] = s.nextInt();
		// }
		// int t=s.nextInt();
		// for(int i=0;i<m-2;i++) {
		// for(int j=i+1;j<m-1;j++) {
		// for(int k=j+1;k<m;k++) {
		// if(arr[i]+arr[j]+arr[k]==t) {
		// int q=arr[i];
		// System.out.println(q +" ");
		// int w=arr[j];
		// System.out.println(w +" ");
		// int e=arr[k];
		// System.out.println(e+" ");
		//
		//
		// }
		// }
		// }
		// }
		//
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < n; i++) {
			int num = scn.nextInt();
			arr[i] = num;
		}
		int itm = scn.nextInt();

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		printing(arr, itm);
	}

	public static void printing(int[] arr, int itm) {

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == itm) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					}
				}
			}
		}

	}

}
