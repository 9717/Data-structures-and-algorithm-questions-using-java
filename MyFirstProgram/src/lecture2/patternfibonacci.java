package lecture2;
import java.util.*;

public class patternfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=4;
       int a=0;
       int b=1;
       int nst=0;
      // int r=0;
       for(int i=0;i<=n;i++) {
    	   for(int j=1;j<=nst;j++) {
    		  
    		   System.out.print(a+"\t");
    		  
    		 int  r=a+b;
    		  
    		   a=b;
    		   b=r;
    		   System.out.print(" ");
    	   
    	   }
//    	   System.out.print(" ");
    	   System.out.print("\n");
    	   nst++;
       }
       
	}

}
