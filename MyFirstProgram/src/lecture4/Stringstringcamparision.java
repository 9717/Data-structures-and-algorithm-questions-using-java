package lecture4;

import java.util.Scanner;

public class Stringstringcamparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		occuring(str);
	}

	public static void occuring(String str) {
		int count[] = new int[256];

		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		char ch[] = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1) 
				System.out.print(str.charAt(i) +""+ count[str.charAt(i)]);
		}
		
	}
}
