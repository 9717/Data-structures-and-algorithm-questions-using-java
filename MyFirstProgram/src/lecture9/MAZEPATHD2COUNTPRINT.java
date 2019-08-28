package lecture9;

import java.util.Scanner;

public class MAZEPATHD2COUNTPRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long a=s.nextLong();

		printMazePathWD(a-1, a-1, 0, 0," ");
		System.out.println("\n"+countMazepath(a-1, a-1, 0, 0));
	}

	public static void printMazePathWD(long er, long ec, long cr, long cc, String res) {
		if (er == cr && ec == cc) {
			System.out.print(res+" ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePathWD(er, ec, cr + 1, cc, res + "V");
		printMazePathWD(er, ec, cr, cc + 1, res + "H");
		if(cr==cc||cr+cc==er) {
		printMazePathWD(er, ec, cr + 1, cc + 1, res + "D");
	}
	}

	public static int countMazepath(long er, long ec, long cr, long cc) {
		if (er == cr && ec == cc) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int mycount = 0;
		if(cr==cc||cr+cc==er) {
	int c1=countMazepath(er, ec, cr+1, cc+1);
		}
		
		mycount = countMazepath(er, ec, cr, cc + 1) + countMazepath(er, ec, cr + 1, cc)+countMazepath(er, ec, cr+1, cc+1);
		return mycount;
	}

}
