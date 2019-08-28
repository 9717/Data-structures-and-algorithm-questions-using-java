package lecture1;

public class sumofaddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2635;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
			//	sum = sum + (n % 10);
				n = n / 10;
			//	System.out.println(sum);
			} else {
				sum = sum + (n % 10);
				n = n / 10;
				System.out.println(sum);
			}
		}

	}

}
