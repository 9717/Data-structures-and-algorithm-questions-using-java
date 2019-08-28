package lecture4;
import java.util.*;
public class STRINGSDIFFERENCEIASCIICODES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);       
	        String str=sc.nextLine();
	       
	        ascii(str);

	}
	public static void ascii(String s) {
		 String news="";
		 for(int i=0;i<s.length();i++) {
			 int val=s.charAt(i);
			 if(i%2==0) {
				 val=val+1;
				 news=news+(char)(val);
			 }
			 else{
				 val=val-1;
				 news=news+(char)(val);
			 }
		 }
		 System.out.println(news);
		
	}

}
