package lecture3;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,40,30,20,10 };
		bubblesort(arr);
		display(arr);
		
		
		

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	public static void bubblesort(int[] arr) {

		for (int i = 1; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}

		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j+1];
		arr[j+1] = temp;
	}

}
