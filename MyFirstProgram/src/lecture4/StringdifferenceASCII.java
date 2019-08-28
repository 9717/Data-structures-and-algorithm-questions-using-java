package lecture4;

import java.util.*;

public class StringdifferenceASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println(ascii(str));
	}

	public static String ascii(String str) {
		StringBuilder s = new StringBuilder();
		char p = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char q = str.charAt(i);
			s.append(p);
			s.append(q - p);
			p = q;
		}
       s.append(p);
       return s.toString();
	}
}
