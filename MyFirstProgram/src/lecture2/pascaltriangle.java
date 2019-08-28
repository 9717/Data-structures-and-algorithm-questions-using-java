package lecture2;
import java.util.*;
public class pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int cal=1;
           int n=s.nextInt();
           for(int i=0; i<n; i++)           
           {
                    cal=1;
                   for(int j=0; j <=i; j++)    
               {
                   System.out.print(cal+"\t");
                   cal=cal*(i-j)/(j+1);
                   }
                   System.out.println();
            
       
       	}
	}

}
