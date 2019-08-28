package lecture1;
import java.util.*;
public class vonnaumanlovesbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			 int b = s.nextInt();

				int d = 0;
				int tp = 1;// 2 raise to power 0.
				while (b != 0) {
					int rem = b % 10;
					d = d + rem * tp;
					b = b/ 10;
					tp = tp * 2;
				}

				System.out.println(d);
		}

	}

}
/*
 VON NEUMAN LOVES BINARY
Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.


Input Format:
The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

Constraints:
N<=1000
Digits in binary representation is <=16.

Output Format:
N lines,each containing a decimal equivalent of the binary number.

Sample Input:
4
101
1111
00110
111111
Sample Output:
5
15
6
63
Explanation:
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
*/
