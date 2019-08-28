package lecture8;

import java.util.Scanner;

public class Lexicographic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        System.out.print("0 ");
        for(int i = 1 ; i <=9 ; i++){
           printlexico(i, n);
        }
		

	}
	public static void printlexico(int i,int n) {
		if(i<=n) {
			System.out.print(i+" ");
		}
		for(int j=0;j<=9;j++) {
			if(i+j<n) {
				printlexico(10*i+j, n);
			}
		}
	}
}
//0 1 10 2 3 4 5 6 7 8 9 