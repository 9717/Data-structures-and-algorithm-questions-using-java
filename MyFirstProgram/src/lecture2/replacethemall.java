package lecture2;
import java.util.Scanner;
import java.lang.*;

public class replacethemall {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
//		int num = 102;
//		int x = 0;
//		if (num == 0) {
//			System.out.println("5"); 
//
//		} else {
//			int rem = num % 10;
//			if (rem == 0) {
//				rem = 5;
//			}
//			num = num / 10;
//
//			x = x * 10 + rem;
//			
//		}
//
//		System.out.println(num);
		Scanner s=new Scanner(System.in);
	      int  n=s.nextInt();
		
		int sum=0;
		int b=1;
		int c=0;
		if(n==0) {
			System.out.println("5");
		}
		else {	while(n!=0) {
			
			 
			int digit=n%10;
			if(digit==0) {
			digit=5;
			}
			sum=sum+digit*b;
			b=b*10;
			n=n/10;
		}
		System.out.println(sum);
		}
		
	}

}
