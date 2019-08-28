package lecture5;

import java.util.*;

public class stringevenoddcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		for (int i = 0; i < str.length(); i++) {
		      if(i%2==0) {
		    	  char ch=(char) (str.charAt(i)-1);
		    	  ch++;
		    	  System.out.print(ch);
		      }
		      else {
		    	  char ch=(char) (str.charAt(i)+1);
		    	  ch++;
		    	  System.out.print(ch);
		      }
		}

	}

}
