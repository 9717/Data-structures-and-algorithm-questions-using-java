package lecture5;

public class questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,1,5,6,5,3,6,4i};
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		System.out.println(ans);

	}

}
