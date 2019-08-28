package lecture4;

import java.util.Scanner;

public class CBTSHirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			for(int i=1;i<=n;i++) {
				int d=i;
				int r=0;
				int b=0;
				int c=0;
				for(int j=0;d>0;j++) {
					r=d%2;
					d=d/2;
					c=(int)Math.pow(10, j);
					b=b+r*c;
				}
				System.out.print(b+" ");
			}
			System.out.println();
			t--;
		}
			
		
	}
}
