package lecture1;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1=16;
	        int n2=24;
	        while (n1%n2!=0)
	          {
	              int rem=n1%n2;
	              n1=n2;
	              n2=rem;
	              
	          }
	          System.out.println(n2);

	}

}
