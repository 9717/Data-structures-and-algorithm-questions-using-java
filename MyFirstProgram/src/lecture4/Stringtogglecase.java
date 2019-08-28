package lecture4;
import java.util.*;
public class Stringtogglecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,len;
	        char ch;
	        Scanner sc=new Scanner(System.in);       
	        String str=sc.nextLine();
	        len=str.length();
	        for(i=0;i<len;i++)
	        {
	            ch=str.charAt(i);
	            if(Character.isUpperCase(ch))
	                System.out.print(Character.toLowerCase(ch));
	            else
	                System.out.print(Character.toUpperCase(ch));
	        }

	}

}
