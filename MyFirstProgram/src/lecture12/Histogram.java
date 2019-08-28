package lecture12;

import java.util.Scanner;
import java.util.Stack;



import lecture11.stackusingarray;

public class Histogram {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		Histogram obj = new Histogram();

		int n = scn.nextInt();

		long[] arr = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextLong();
		}

		System.out.println(getMaxArea(obj.new Stack(n), arr, n));
	}

	public static long getMaxArea(Stack s, long hist[], int n) throws Exception {

		long max_area = 0;
		long tp;
		long area_with_top;

		int i = 0;
		while (i < n) {
			if (s.isEmpty() || hist[(int) s.top()] <= hist[i])
				s.push(i++);

			else {
				tp = s.top();
				s.pop();

				area_with_top = hist[(int) tp] * (s.isEmpty() ? i : i - s.top() - 1);

				if (max_area < area_with_top)
					max_area = area_with_top;
			}
		}

		while (s.isEmpty() == false) {
			tp = s.top();
			s.pop();
			area_with_top = hist[(int) tp] * (s.isEmpty() ? i : i - s.top() - 1);

			if (max_area < area_with_top)
				max_area = area_with_top;
		}

		return max_area;

	}

	public class Stack {

		private int tos;

		protected long[] data;

		public Stack() {
			// TODO Auto-generated constructor stub
			this(5);
		}

		public Stack(int cap) {
			// TODO Auto-generated constructor stub
			this.tos = -1;

			this.data = new long[cap];
		}

		public void push(long item) throws Exception {

			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}

			tos++;

			this.data[this.tos] = item;

		}

		public long pop() throws Exception {

			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}

			long rv = this.data[this.tos];

			this.data[this.tos] = 0;

			this.tos--;

			return rv;

		}

		public long top() throws Exception {

			if (this.size() == 0) {
				throw new Exception("Stack is Emptty");
			}

			return this.data[this.tos];

		}

		public int size() {

			return this.tos + 1;

		}

		public boolean isEmpty() {

			return this.size() == 0;

		}

		public void display() {

			System.out.println("------------------");

			for (int i = tos; i >= 0; i--) {
				System.out.print(this.data[i] + " ");
			}

			System.out.println("------------------");
		}
	}

}
