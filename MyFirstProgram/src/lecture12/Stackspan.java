package lecture12;

import java.util.*;

public class Stackspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int price[] = new int[N];
		for(int i=0;i<price.length;i++) {
			price[i]=s.nextInt();
		}
		int n = price.length;
		int S[] = new int[n];

		
		calculateSpan(price, n, S);

		
		printArray(S, n);
		System.out.println("END");
	}

	static void calculateSpan(int A[], int n, int ans[]) {
		
		ans[0] = 1;

		
		for (int i = 1; i < n; i++) {
			int counter = 1;
			while ((i - counter) >= 0 && A[i] > A[i - counter]) {
				counter += ans[i - counter];
			}
			ans[i] = counter;
		}
	}

	
	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " " );
	}
	
}
