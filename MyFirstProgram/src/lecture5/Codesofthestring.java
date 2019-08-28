package lecture5;

import java.util.ArrayList;
import java.util.Scanner;

public class Codesofthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(codes(str));
	}

	private static ArrayList<String> codes(String str) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			ArrayList<String> b = new ArrayList<>();
			b.add("");
			return b;
		}
		ArrayList<String> res = new ArrayList<>();
		char cc = str.charAt(0);
		char alphabet = (char) (cc - '1' + 'a');
		String ros = str.substring(1);
		ArrayList<String> recres = codes(ros);
		for (int i = 0; i < recres.size(); i++) {
			res.add(alphabet + recres.get(i));

		}
		if(str.length()>=2) {
			int cc2=Integer.valueOf(str.substring(0, 2));
			if(cc2>=10&&cc2<=26) {
				String ros2=str.substring(2);
				char alphabet2=(char)(cc2-1+'a');
				ArrayList<String> recres2=codes(ros2);
				for(int i=0;i<recres2.size();i++) {
					res.add(alphabet2+recres2.get(i));
				}
			}
		}
		 return res;
	}

}
