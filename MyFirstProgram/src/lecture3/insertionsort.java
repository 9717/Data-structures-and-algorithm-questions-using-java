package lecture3;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 50, 40, 30, 20, 10 };
		insertion(arr);
		display(arr);
	}
	public static void display(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}
	

	public static void insertion(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}

		}

	}

	public static void swap(int[] arr, int i, int j) {
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
