package lecture6;
import java.util.*;
public class recurion {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner s=new Scanner(System.in);
	//PDISKIP(5);
    // fact(5);
		int[] arr= {3,5,11,14,17,19};
	//	int i= arr.length;
	//	System.out.println(issorted(arr,0));
		System.out.println(firstindex(arr,0,17));
	}
	public static void PDISKIP(int n) {
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n); ;
		}
		
		PDISKIP(n-1);
		if(n%2==0) {
			System.out.println(n); ;
		}
	}
	public static int fact(int n) {
		if(n>0) {
			return n*fact(n-1);
		}
		else {
			return 1;
		}
		
		
	} 
  public static boolean issorted( int[] arr,int i) {
	  if(i==arr.length-1) {
		  return true;
	  }
	  if(arr[i]>arr[i+1]) {
		  return false;
	  }
	  else
	  { boolean restans =issorted(arr,i+1);
	  return restans ; }
  }
  public static int firstindex(int[] arr ,int i,int data) {
	  if(arr[i]==arr.length-1) {
		  return i;
	if(arr[i]==data) {
		
	}
	  } 
  }
}
