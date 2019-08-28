package lecture3;

import java.util.Arrays;
import java.util.*;

public class binarysearch {

	public static void main(String[] args) {
	//	 TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];      // { 10, 20, 30,40,50 };
		for(int i=0;i<arr.length-1;i++)
			arr[i]=s.nextInt();
		int data = s.nextInt(); // 50;
		int end = arr.length - 1;
		int index = binarysearch(arr, 0, end, data);
		if (index != -1) {
			System.out.println(index);
		}
//		 System.out.println(data + " present at index " + index);
//
//	  else
//		 {
//		 System.out.println(data + "is not present");
//		 }
//
//		 Arrays.sort(arr);

	}

	public static int binarysearch(int[] arr, int start, int end, int data) {
            Scanner s=new Scanner(System.in);
            
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == data) {

				return mid;

			} else if (arr[mid] < data) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;

		}
		return -1;
	}
		
	{	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		int m=s.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == m) {
				System.out.println(mid);
				break;
			} else if (arr[mid] < m) {
				start = mid + 1;
				
			} else {
				end = mid - 1;
			}
				
			start++;
			
			
		}
		
	}
	}
