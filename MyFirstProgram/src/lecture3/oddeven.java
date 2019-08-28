package lecture3;

import java.util.*;

public class oddeven {

	private static Scanner scan;

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// int t = scan.nextInt();
		// for(int i=0; i<t-1; i++)
		// {
		// int n = scan.nextInt();
		// int type = scan.nextInt();
		// int v;
		// for(int j=0; j<n; j++)
		// {
		// v = scan.nextInt();
		// if(type == 0){
		// if(v%2 == 0) System.out.println("yes");
		// else System.out.println("no");
		// }
		//
		// else{
		// if(v%2 != 0) System.out.println("yes");
		// else System.out.println("no");
		// }
		// }
		// }
		Scanner scan = new Scanner(System.in);
		int t =  scan.nextInt();

		int n = scan.nextInt();
		int type = scan.nextInt();
		int v;
		 
			v = scan.nextInt();
			if (type == 0) {
				if (v % 2 == 0)
					System.out.println("yes");
				else
					System.out.println("no");
			}

			else {
				if (v % 2 != 0)
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	}
/*
Due to growing Traffic Problem Kejriwal wants to devise a new scheme. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?


Input Format:
The first line contains N , then N integers follow each denoting the number of the car.

Constraints:
N<=1000
Car No >=0 && Car No <=1000000000

Output Format:
N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !

Sample Input:
2
12345
12134
Sample Output:
Yes
No
Explanation:
1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.
*/
