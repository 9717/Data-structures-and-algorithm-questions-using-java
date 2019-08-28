package lecture4;

import java.util.Scanner;

public class StringRemovesDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s, ans = "";
		char ch;
		int l, i = 0;
		Scanner sc = new Scanner(System.in);
       
		s = sc.nextLine();
		l = s.length();
		s += " ";
		ch = s.charAt(0);
		while (i < l) {
			ans = ans + ch;
			while (s.charAt(++i) == ch && i < l) {
			}
			ch = s.charAt(i);
			
		}

		System.out.println(ans);
	}
}
