package lecture2;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;

		int i = 0;
		int j;
		while (i < n) {
			j = 0;
			while (j < n)

			{
				if (j < n - i)
					System.out.print("*");
				else

					System.out.print(" ");
				j++;

			}
			j = 0;
			while (j < n)

			{

				if (j < i)
					System.out.print(" ");
				else

					System.out.print("*");
				j++;
			}

			System.out.println();
			i++;
		}
		i = 1;
		while (i <= n) {

			j = 0;
			while (j < n) {
				if (j < i)
					System.out.print("*");
				else

					System.out.print(" ");
				j++;
			}

			j = 0;
			while (j < n)

			{

				if (j < n - i)
					System.out.print(" ");
				else

					System.out.print("*");
				j++;
			}

			System.out.println();
			i++;

		}

	}

}
