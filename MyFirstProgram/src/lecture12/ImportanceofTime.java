package lecture12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceofTime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Queue<Integer>callorder=new LinkedList<>();
		int[] idealorder = new int[n];
		for(int i=0;i<n;i++) {
			callorder.add(s.nextInt());
		}
		for(int i=0;i<n;i++) {
			idealorder[i]=s.nextInt();
		}
		System.out.println(process(n,callorder,idealorder));
	}

	private static int process(int n, Queue<Integer> callorder, int[] idealorder) {
		int time=0;
		int i=0;
		while(i<n) {
			if(callorder.peek()==idealorder[i]) {
				callorder.remove();
				i++;
			}
			else {
				callorder.add(callorder.remove());
				
			}
			time++;
		}
		return time;
	}

}
