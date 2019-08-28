package lecture9;

import java.util.*;

public class MAZEPATHDCOUNTPRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 int N1 = s.nextInt();
		 int N2 = s.nextInt();

		printMazePathWD(N1-1, N2-1, 0, 0," ");
		System.out.println("\n"+countMazepath(N1-1, N2-1, 0, 0));
	}

	public static void printMazePathWD(int er, int ec, int cr, int cc, String res) {
		if (er == cr && ec == cc) {
			System.out.print(res+" ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePathWD(er, ec, cr + 1, cc, res + "V");
		printMazePathWD(er, ec, cr, cc + 1, res + "H");
		printMazePathWD(er, ec, cr + 1, cc + 1, res + "D");
	}

	public static int countMazepath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int mycount = 0;
		mycount = countMazepath(er, ec, cr, cc + 1) + countMazepath(er, ec, cr + 1, cc)+countMazepath(er, ec, cr+1, cc+1);
		return mycount;
	}
}
