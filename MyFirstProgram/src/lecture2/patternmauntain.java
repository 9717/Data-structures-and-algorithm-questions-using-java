package lecture2;
import java.util.*;
public class patternmauntain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n+1;
		for(int row=1;row<=n;row++){
			int val = 1;
			int val2 = row;
			
			for(int cst=1;cst<=nst;cst++){
				System.out.print(val+" ");
				val++;
			}
			
			for(int csp=1;csp<=nsp;csp++){
				System.out.print(" "+" ");
			}
			
			if(row==n){
				val2= row-1;
				for(int cst=1;cst<nst;cst++){
				System.out.print(val2+" ");
				val2--;
			}
			}
			else{
				for(int cst=1;cst<=nst;cst++){
				System.out.print(val2+" ");
				val2--;
			}
			}
			
			System.out.println();
			nsp=nsp-2;
			nst++;
		}
	}

}
