package lecture2;

import java.util.Scanner;

public class basiccalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s= new Scanner(System.in);
		  char ch = s.next().charAt(0);
      do {
//    	  int a=s.nextInt();
//    	  int b=s.nextInt();
//    	  int r;
    	  switch(ch) {
    	  case'+':
    		  int a=s.nextInt();
        	  int b=s.nextInt();
        	  int r=a+b;
    		  System.out.println(r);
    		  break;
    	  case'-':
    		   a=s.nextInt();
        	 b =s.nextInt();
        	   r=a-b;
    		  System.out.println(r);
    		  break;
    	  case'*':
    		  a=s.nextInt();
           	 b =s.nextInt();
    		  r=a*b;
    		  System.out.println(r);
    		  break;
    	  case'/':
    		  a=s.nextInt();
         	 b =s.nextInt();
    		  r=a/b;
    		  System.out.println(r);
    		  break;
    	  case'x':
    		  break;
    	  case'X':
    		  break;
    		  default:
    			  System.out.println("invalid operation . try again");
    	  }
    	
    	  
      }while(ch!='X'&&ch!='x');
      return;
      

	}
   

}
