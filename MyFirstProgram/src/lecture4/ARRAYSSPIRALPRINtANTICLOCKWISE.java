package lecture4;

import java.util.Scanner;

public class ARRAYSSPIRALPRINtANTICLOCKWISE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		int m,n; 
		m = sr.nextInt();
		n = sr.nextInt();
		if(m>0 && m<10 && n>0 && n<10)
		{	
			int a[][] = new int [m][n];
		
			for(int i =0 ; i<m ; i++)
				for(int j =0; j<n ; j++)
				{
					a[i][j] = sr.nextInt();
					
				}
			spiralPrint(m, n, a);

	}

	public	static void spiralPrint(int m, int n, int a[][]) 
		{ 
			int i, k = 0, l = 0; 
			while (k < m && l < n) 
			{ 
				for (i = l; i < n; ++i) 
				{ 
					System.out.print(a[k][i]+", "); 
				} 
				k++; 
				for (i = k; i < m; ++i) 
				{ 
					System.out.print(a[i][n-1]+", "); 
				} 
				n--; 
				if ( k < m) 
				{ 
					for (i = n-1; i >= l; --i) 
					{ 
						System.out.print(a[m-1][i]+", "); 
					} 
					m--; 
				} 
				if (l < n) 
				{ 
					for (i = m-1; i >= k; --i) 
					{ 
						System.out.print(a[i][l]+", "); 
					} 
					l++;	 
				}		 
				System.out.println("END");
			} 
		}

}
