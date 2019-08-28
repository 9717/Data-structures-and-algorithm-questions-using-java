package LECTURES;

import java.util.ArrayList;

public class recursiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getSS("abc"));
//		System.out.println(getSSWAscii("ab"));
//		System.out.println(getPermutations("abc"));
//		System.out.println(getBoardPath(3, 0));
//
		printSS("abc", "");
//		printSSWAscii("ab", "");
//		printPermutations("abc", "");
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}

		return myResult;
	}

	public static ArrayList<String> getSSWAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSSWAscii(ros);

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
			myResult.add((int) cc + recResult.get(i));
		}

		return myResult;
	}

	public static ArrayList<String> getPermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getPermutations(ros);
		for (int i = 0; i < recResult.size(); i++) {
			String recString = recResult.get(i);
			for (int j = 0; j <= recString.length(); j++) {
				String mystring = recString.substring(0, j) + cc + recString.substring(j);
				myResult.add(mystring);
			}
		}
		return myResult;
	}

	public static ArrayList<String> getBoardPath(int end, int curr) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			recResult = getBoardPath(end, curr + dice);
			for (int j = 0; j < recResult.size(); j++) {
				myResult.add(dice + recResult.get(j));
			}
		}

		return myResult;
	}

	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, res);
		printSS(ros, res + cc);
	}

	public static void printSSWAscii(String str, String res) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSSWAscii(ros, res);
		printSSWAscii(ros, res + cc);
		printSSWAscii(ros, res + (int) cc);
	}

	public static void printPermutations(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, res + cc);
		}
	}

}
