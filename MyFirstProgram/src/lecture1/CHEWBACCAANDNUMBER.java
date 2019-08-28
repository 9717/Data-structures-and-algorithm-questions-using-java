package lecture1;

import java.util.*;

public class CHEWBACCAANDNUMBER {

	 static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long ans = 0;
		long pow = 1;
		while (n != 0) {
			long rem = n % 10;
			if (rem % 4==0) {
				if (rem == 9 && n / 10 == 0) {
				} else {
					rem = 9*rem;
				}
			}
			ans = ans + rem * pow;
			pow = pow * 10;
			n = n / 10;

		}
		System.out.println(ans);
	}

}
