package lecture2;

public class hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int c1=(n-1)/2;
		int c2=3*n/2-1;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=c1 || i-j>=c1 ||j-i>=c1||i+j>=c2) {
					System.out.print(" *");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println("");
		}
		

	}

}
