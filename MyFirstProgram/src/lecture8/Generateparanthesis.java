package lecture8;

import java.util.Scanner;

public class Generateparanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		char[] str = new char[2 * n];
		printParenthesis(str, n);
	}

	public static void printParenthesis(char[] str, int n) {
		// TODO Auto-generated method stub
		if (n > 0)
			printParenthesis(str, 0, n, 0, 0);
		return;
	}

	public static void printParenthesis(char[] str, int pos, int n, int open, int close) {
		if (close == n) {

			for (int i = 0; i < str.length; i++)
				System.out.print(str[i]);
			System.out.println();
			return;
		} else {
			if (open > close) {
				str[pos] = ')';
				printParenthesis(str, pos + 1, n, open, close + 1);
			}
			if (open < n) {
				str[pos] = '(';
				printParenthesis(str, pos + 1, n, open + 1, close);
			}
		}
	}

}
