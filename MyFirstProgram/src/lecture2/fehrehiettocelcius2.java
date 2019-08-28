package lecture2;
import java.util.*;
public class fehrehiettocelcius2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input=new Scanner(System.in);
          int min, max,step;
        min=0;
        max=100;
        step=20;
        int f=0;        //input.nextInt();
		
	
		while(f<=max)
		{
		 int c=(int)((5.0/9)*(f-32));
		  System.out.println(f+" "+c);
		  f+=step;
		    
		}
	}

}
