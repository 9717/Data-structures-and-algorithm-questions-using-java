package lecture20;

import java.util.Scanner;

public class MAXIMUMDEPTHOFCONSECUTIVEPARENTHESIS {

	public static void main(String[] args) throws Exception {
	Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0){
    		String str = s.next();
    		MAXIMUMDEPTHOFCONSECUTIVEPARENTHESIS mainobj = new MAXIMUMDEPTHOFCONSECUTIVEPARENTHESIS();
    		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    		System.out.println(MaxDepth(str, stack));
		}

	}

	public static int MaxDepth(String str, StacksUsingArrays stack) throws Exception {

	    int current_max = 0; // current count  
        int max = 0; // overall maximum count  
        int n = str.length(); 
  
        // Traverse the input string  
        for (int i = 0; i < n; i++) { 
            if (str.charAt(i) == '(') { 
                current_max++; 
  
                // update max if required  
                if (current_max > max) { 
                    max = current_max; 
                } 
            } else if (str.charAt(i) == ')') { 
                if (current_max > 0) { 
                    current_max--; 
                } else { 
                    return -1; 
                } 
            } 
        } 
  
        // finally check for unbalanced string  
        if (current_max != 0) { 
            return -1; 
        } 
  
        return max; 
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}
