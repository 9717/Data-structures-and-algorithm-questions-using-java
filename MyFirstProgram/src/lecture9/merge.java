package lecture9;

import javax.naming.PartialResultException;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] one= {3,5,6,8};
//		int[] two= {1,4,7};
//	
		int[] arr= {3,6,2,4,1,5};
		int[] sorted=mergesort(arr, 0, arr.length-1);
		display(arr);
		

	}
	public static int[] mergesort(int[] arr , int start,int end) {
		
		if(start==end) {
			int[] br=new int[1];
			br[0]=arr[start];
			return br;
			
		}
		int mid=(start+end)/2;
		int[] one=mergesort(arr, start, mid);
		int[] two=mergesort(arr, mid+1, end);
		int[] sorted=merge(one,two);
		return sorted;
	
	}
	public static int[] merge(int[] one,int[] two) {
		int i=0,j=0,k=0;
		int[] ans=new int[one.length+two.length];
		while(i<one.length&&j<two.length) {
			if(one[i]<two[j]) {
				ans[k]=one[i];
				i++;
				k++;
			}
		}
		
	}
	public static void quicksort(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int pindex=partition(arr, start, end);
		quicksort(arr, start, pindex-1);
		quicksort(arr, pindex+1, end);
			
		}
	public static int partition(int[] arr,int start,int end) {
		int pindex=start;
		int pivot=arr[end];
		for(int i=start;i<=end-1;i++) {
			if(arr[i]<=pivot) {
				swap(arr,i,pindex);
				pindex++;
			}
		}
		swap(arr,pindex,end);
		return pindex;
	   }
	
	}
public Static void display(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		
	}
}

}
