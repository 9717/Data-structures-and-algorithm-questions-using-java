package lecture12;


import lecture11.stackusingarray;
public class Dynamicstack {
	public class DynamicStack extends stackusingarray {

		
		private static final int DEFAULT_CAPACITY = 0;
		private Object data;

		public DynamicStack() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public DynamicStack(int capacity) throws Exception {
			super(capacity);
		}

		public void push(int item) throws Exception {
		if(this.size()==this.data.length) {
			int[] arr=new int[2*this.data.length];
		}
		}
		
	}		
}
