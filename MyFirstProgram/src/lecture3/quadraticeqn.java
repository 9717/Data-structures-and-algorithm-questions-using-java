package lecture3;
import java.io.*; 
import static java.lang.Math.*; 
public class quadraticeqn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a = 1, b = -11, c = 28;  //1 -11 28
		findRoots( a, b, c);
	}

	public static void findRoots(int a, int b, int c) {

		if (a == 0) {
			System.out.println("Invalid");
			return;
		}

		int d = b * b - 4 * a * c;
		double sqrt_val = sqrt(abs(d));

		if (d > 0) {
			System.out.println(" real and distinct \n");
			
			System.out.println((double) (-b - sqrt_val) / (2 * a)+" " +(double) (-b + sqrt_val) / (2 * a));
		} else 
		{
			System.out.println("Roots are complex \n");

			System.out.println(
					-(double) b / (2 * a) + " + i" + sqrt_val + " " + -(double) b / (2 * a) + " - i" + sqrt_val);
		}
	}
}
