package lecture1;
import java.util.*;
public class floydno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Rows to print");
        int r1 = s.nextInt();
        int n = 1;
        System.out.println("Floyd's Triangle:");
        for (int r = 1; r <= r1; r++) {
               for (int count = 1; count <= r; count++) {
                       System.out.print(n + " ");
                       n = n + 1;
               }
               System.out.println();

	}

  }
}
