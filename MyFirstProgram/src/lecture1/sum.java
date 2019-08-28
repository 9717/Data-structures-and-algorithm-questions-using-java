package lecture1;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("enter no.");
		int p=S.nextInt();
		int i,t=0;
		for(i=1;i<=p;i++)
		{
			t=t+i;
		}
			
		System.out.println("total"+t);	
			
			
	}
}
