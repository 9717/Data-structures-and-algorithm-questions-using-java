package lecture5;

import java.util.Scanner;

public class Vivek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			long totalsm=0;
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				totalsm=totalsm+arr[i];
			}
			System.out.println(getscore(arr,0,arr.length-1,totalsm));
		}
		

	}

	private static int getscore(int[] arr, int si, int ei, long totalsm) {
		long halfsm=totalsm/2;
		if(totalsm%2!=0) {
			return 0;
		}
		long leftsm=0;
		for(int cut=si;cut<ei;cut++) {
			leftsm+=arr[cut];
			if(leftsm>totalsm) {
				break;
			}
			if(leftsm==halfsm) {
				int ls=getscore(arr, si, cut, halfsm);
				int rs=getscore(arr, cut+1, ei, halfsm);
				return 1+Math.max(ls, rs);
			}
		}
		return 0;
	}

}
