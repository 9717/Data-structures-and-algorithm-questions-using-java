package lecture7;

import java.util.*;

public class RATCHEESE {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			String str = s.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = str.charAt(j) == '0' ? 0 : -1;
			}
		}
		flag = false;
		mazepath(arr, 0, 0, arr.length - 1, arr[0].length - 1);
		if (flag == false)
			System.out.println("NO PATH FOUND");
	}

	static boolean flag = false;
	

	public static void mazepath(int[][] arr, int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			arr[dr][dc] = 1;
			printmat(arr);
			flag = true;
			return;
		}
		if (sr > dr || sc > dc || sr < 0 || sc < 0 || arr[sr][sc] == 1 || arr[sr][sc] == -1) {
			return;
		}
		arr[sr][sc]=1;
		mazepath(arr, sr+1, sc, dr, dc);
		mazepath(arr, sr-1, sc, dr, dc);
		mazepath(arr, sr, sc+1, dr, dc);
		mazepath(arr, sr, sc-1, dr, dc);
		arr[sr][sc]=0;
	}
	public static void printmat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==-1)
					System.out.print(0+" ");
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
