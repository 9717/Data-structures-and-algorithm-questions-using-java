package lecture2;

import java.util.*;

public class patternrohmbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sp = n;
		int st = 1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= sp + 2; j++) 
				System.out.print("\t");
				int count = st / 2 + 1;
				for (int k = 1; k <= st; k++) {
					System.out.print("    " + count + "   ");
					if (k > count / 2) {
						count--;
					} else {
						count++;
					}
				}
				System.out.println();
				if (i <= (n + count) / 2) {
					sp = sp - 1;
					st = st + 2;
				} else {
					sp = sp + 1;
					st = st - 2;
				}
			}
		}

	}


