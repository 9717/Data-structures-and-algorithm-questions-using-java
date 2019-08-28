package lecture1;
import java.util.*;
public class fibonacii2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//System.out.print();
//		int sum=0;
//		    int num = input.nextInt();
//		    int f1=0,f2=0,f3=1;
//		    for(int i=1;i<=num;i++){
//		       // System.out.println(f3);
//		        sum+=f3;
//		        f1=f2;
//		        f2=f3;
//		        f3=f1+f2;
//		    }
//		    System.out.println(sum);
	    int num =10;                     // input.nextInt();
    	int sum=0;
    int f1=0,f2=0,f3=1;
    for(int i=1;i<num;i++){
       // System.out.println(f3);
        sum=sum+f3;
        f1=f2;
        f2=f3;
        f3=f1+f2;
    }
    System.out.println(f3);
	}

}
