package lecture3;
  import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr =new int[n];
		int m=s.nextInt();
		
		 System.out.println(linearSearch(arr, m));
	}
	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}

		return -1;
	}
}
