package lecture4;

public class printstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		printstring(s);

	}

	public static void printstring(String s) {
		for (int i = 0; i <= s.length()-1 ; i++) {
			for (int j = 0; j <= s.length()-1 ; j++) {
				System.out.println(s.substring(i, i + j) + " ");
			}
		}
	}
}