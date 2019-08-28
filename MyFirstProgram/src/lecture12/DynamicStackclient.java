package lecture12;
import lecture11.stackusingArrayclient;
import lecture11.stackusingarray;
public class DynamicStackclient {
	

	public static void main(String[] args) throws Exception {

		stackusingarray stack = new Dynamicstack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			displayStackInfo(stack);
		}
		// stack.push(60);
		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}

		stack.pop();
	}

	
		
}
