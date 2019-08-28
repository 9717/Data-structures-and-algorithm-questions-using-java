package Lecture14and15;

public class LinkedListAsStack {
	private LinkedList list;

	public LinkedListAsStack() {
		this.list = new LinkedList();

	}

	public int size() {
		return this.size();
	}

	public boolean isEmpty() {
		return this.isEmpty();
	}

	public void push(int data) {
		list.addfirst(data);
	}

	public int pop() throws Exception {
		return this.list.removeFirst();
	}

	public int top() throws Exception {
		return this.list.getfirst();

	}

	public void display() {
		this.list.display();
	}
}
