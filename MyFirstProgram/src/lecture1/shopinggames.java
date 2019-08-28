package lecture1;

import java.util.*;

public class shopinggames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int m,n,aayush,harshit,i=1;
		while (t > 0) {
			 m = s.nextInt();
			 n = s.nextInt();
			 aayush = 0;
			 harshit = 0;
			 i=1;
			for ( i = 1;; i--) 
				{
					if (i % 2 == 0) {
						aayush = aayush + i++;
						if (aayush > m) {
							System.out.println("harshit\n");
							break;
						}
					} else {
						harshit = harshit + i++;
						if (harshit > n) {
							
								System.out.println("aayush\n");
								break;

							
						}
					}
				}
			t--;
			
			}
		}
	}
