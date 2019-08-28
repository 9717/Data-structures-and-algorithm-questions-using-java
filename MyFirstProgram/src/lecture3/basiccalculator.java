package lecture3;

import java.util.Scanner;

public class basiccalculator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int flag = 0;
		// while(flag==0){
		// flag=1;
		char ch = obj.next().charAt(0);
		int N1, N2;
		do {
			switch (ch) {
			case '+':
				N1 = obj.nextInt();
				N2 = obj.nextInt();
				N1 = N1 + N2;
				System.out.println(N1);
				break;
			case '-':
				N1 = obj.nextInt();
				N2 = obj.nextInt();
				N1 = N1 - N2;
				System.out.println(N1);
				break;
			case '*':
				N1 = obj.nextInt();
				N2 = obj.nextInt();

				N1 = N1 * N2;
				System.out.println(N1);
				break;
			case '/':
				N1 = obj.nextInt();
				N2 = obj.nextInt();
				N1 = N1 / N2;
				System.out.println(N1);
				break;
			case '%':
				N1 = obj.nextInt();
				N2 = obj.nextInt();
				N1 = N1 % N2;
				System.out.println(N1);
				break;
//			case 'x':
//				System.exit(0);
//				break;
//			case 'X':
//				System.exit(0);
//				break;

			default:
				System.out.println("Invalid operation.Try again.");

			}
		} while (ch == 'x' || ch == 'X');

	}

}
