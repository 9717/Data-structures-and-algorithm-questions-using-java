package lecture5;

import java.util.Scanner;
import java.util.Stack;

public class MinimumDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
         int tc=s.nextInt();
         while(tc-->0) {
        	String str=s.next();
        	minimumintegerpattern(str);
         }
	}

	private static void  minimumintegerpattern(String str) {
		// TODO Auto-generated method stub
		String r="";
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<str.length()+1;i++) {
			st.push(i+1);
			if(i==str.length()||str.charAt(i)=='I') {
				while(st.size()>0) {
					r+=st.peek();
					st.pop();
				}
			}
			
		}
		System.out.println(r);
	}

}
