package lecture9;

import java.util.Scanner;

public class MOSTKSWAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int M = s.nextInt();
		int K = s.nextInt();

		System.out.println(getMax(Integer.toString(M), K));

	}

	private static String getMax(String m, int k) {
		if (k == 0)
			return m;
		char[] ch = m.toCharArray();
		int max = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > ch[max])
				max = i;
		}
		char t = ch[0];
		ch[0] = ch[max];
		ch[max] = t;

		return ch[0] + getMax(new String(ch).substring(1), k - 1);
	}

}
