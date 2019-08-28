package lecture3;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 40, 30, 20, 10 };
		selectionsort(arr);

	}

	public static void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = 1;
			for (int j = i + 1; j < arr.length - 1; j++) {
				int temp = 0;
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		
	    for(int k=0;k<;k++) 
	    	System.out.println(k);
	    

	}

}
