package lecture2;

import java.util.*;

public class simpleinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = n;
		while (sum >= 0) {
			System.out.println(n);
			n = s.nextInt();
			sum = sum + n;
		}

	}
}
