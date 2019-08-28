package lecture6;

import java.util.Scanner;

public class SplitArray {

	private static final int suk = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=scn.nextInt();
			}
			
			split(arr,0,0,"",0,"");
			System.out.println(countsplit(arr, 0, 0, );

	}

	public static void split(int[] arr, int i, int sum1, String s1, int sum2, String s2) {
		if (i == arr.length) {
			if (sum1 == sum2) {
				System.out.println(s1 + " and " + s2);
			}
			return;
		}

		split(arr, i + 1, sum1 + arr[i], s1 + " " + arr[i], sum2, s2);
		split(arr, i + 1, sum1, s1, sum2 + arr[i], s2 + " " + arr[i]);

	}

	private static int countsplit(int[] arr, int si, int currsum, int leftoversum) {
		if (si == arr.length) {
			return (currsum == leftoversum) ? 1 : 0;
		}
		if (currsum == leftoversum) {
			return 1;
		}
		int count = 0;
		count += countsplit(arr, si + 1, currsum + arr[si], leftoversum + arr[si]);
		count += countsplit(arr, si + 1, currsum, leftoversum);
		return count;
	}

	private static void printsplitarray(int[] arr, int si, int currsum, int leftoversum, int[] counter) {
		if (si == arr.length) {
			if (currsum == leftoversum) {
				printformat(arr, counter);
			}
			return;
		}
		if(currsum==leftoversum) {
			printformat(arr,counter);
			return;
		}
		counter[si]=1;
		printsplitarray(arr, si+1, currsum+arr[si], leftoversum+arr[si], counter);
		counter[si]=0;
		printsplitarray(arr, si+1, currsum, leftoversum, counter);
	}

	private static void printformat(int[] arr, int[] counter) {
		for(int i=0;i<arr.length;i++) {
			if(counter[i]==1) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println("end");
		for(int i=0;i<arr.length;i++) {
			if(counter[i]==0) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println();
		
	}
}


