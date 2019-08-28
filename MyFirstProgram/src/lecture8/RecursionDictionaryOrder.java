package lecture8;

import java.util.*;

public class RecursionDictionaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn = new Scanner (System.in);
		    String str = scn.next();
		    ArrayList<String> ans = dictionaryO(str);
		    Collections.sort(ans);
		    displ(ans,str);
		}

		public static ArrayList<String> dictionaryO(String str){
		  
		  if(str.length() == 0){
		    ArrayList<String> br = new ArrayList<>();
		    br.add("");
		    return br;
		  }
		  
		  char cc = str.charAt(0);
		  String ros = str.substring(1);
		  
		  ArrayList<String> rr = new ArrayList<>();
		  ArrayList<String> mr = new ArrayList<>();
		  
		  rr = dictionaryO(ros);
		  
		  for(String rrs : rr){
		    for(int i=0;i<=rrs.length();i++){
		    String val = rrs.substring(0,i) + cc + rrs.substring(i);
		    mr.add(val);  
		    }
		  }
		  
		  return mr;
		}

		public static void displ(ArrayList<String> ans , String str){
		  for(int i=0;i<ans.size();i++){
		    if(ans.get(i).compareTo(str) > 0) {
		      System.out.println(ans.get(i));
		    }
		  }
	    }
	}

