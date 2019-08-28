package lecture1;
import java.util.*;
public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number, Count=0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			if(Number%10==3){
				Count = Count + 1; 
			}
		//	Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
	}

}
