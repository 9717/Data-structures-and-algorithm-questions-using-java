package lecture4;

public class SingleElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 1, 5, 6, 5, 3, 6, 4};
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		
	}

}
