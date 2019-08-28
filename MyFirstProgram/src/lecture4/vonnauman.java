package lecture4;

//import java.util.Scanner;

public class vonnauman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner s = new Scanner(System.in);
		int b = 10000;               //s.nextInt();
//		int n = s.nextInt();
//         System.out.println(n);
//		System.out.println(b);
		int d = 0;
		int tp = 1;
//		for (int i = 0; i < n; i++) {
//			System.out.println(b);
//		}
//		
		while (b != 0) {
			int rem = b % 10;
			d = d + rem * tp;
			b = b / 10;
			tp = tp * 2;
		}
	}

}
