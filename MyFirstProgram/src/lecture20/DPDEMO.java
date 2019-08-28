package lecture20;

import java.util.Scanner;

public class DPDEMO {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
//		Scanner s = new Scanner(System.in);
//
//		int n = s.nextInt();
//
//		int[][] strg = new int[n + 1][n + 1];

		// System.out.println(cbp(n, 0,strg));
		// System.out.println(cbp(n, 0, strg));

//		startAlgo();
//		System.out.println(countMazepathRS(n, n, 0, 0,strg));
//		System.out.println("The cmpRS took time " + endAlgo() + " ms");
		 String S1 = "abbg";
		 String S2 = "agbg";
		 startAlgo();
		 System.out.println(lcs(S1, S2));
		 System.out.println("The lcs took time " + endAlgo() + " ms");

	}

	public static int cbp(int end, int curr, int[] strg) {
		int count = 0;
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		for (int dice = 1; dice <= 6; dice++) {
			int cbp1 = cbp(end, curr + dice, strg);
			count = count + cbp1;
		}
		strg[curr] = count;
		return count;
	}

	public static int cbpIS(int end, int curr) {
		int[] strg = new int[end + 1];
		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				count = count = strg[dice + 1];
			}
			strg[i] = count;

		}
		return strg[curr];
	}

	public static int countMazepathRS(int er, int ec, int cr, int cc,int[][]strg) {
		
		if (er == cr && ec == cc) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int mycount = 0;
		mycount = countMazepathRS(er, ec, cr, cc+1, strg)+countMazepathRS(er, ec, cr+1, cc, strg);
		strg[cr][cc] = mycount;
		return mycount;

	}

	public static int cmpIS(int er, int ec, int cr, int cc) {
		int[][] strg = new int[er + 1][ec + 1];
		strg[er][ec] = 1;
		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er || j == ec) {
					strg[i][j] = 1;
				} else {
					strg[i][j] = strg[i][j + 1] + strg[i + 1][j];

				}
			}
		}
		return strg[cr][cc];

	}

	public static int lcs(String S1, String S2) {
		char cc1=S1.charAt(0);
		char cc2=S2.charAt(0);
		String ros1=S1.substring(1);
		String ros2=S2.substring(1);
		int ans=0;
		if(cc1==cc2) {
			ans=1+lcs(ros1, ros2);
			
		}else {
			int f1=lcs(ros1, ros2);
			int f2=lcs(S1, ros2);
			ans=Math.max(f1,f2);
		}
		return ans;
	}
}
