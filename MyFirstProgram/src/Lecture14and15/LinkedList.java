package Lecture14and15;

import java.util.Stack;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		
	}

	private Node head;
	private Node tail;
	private int size;
	public Node head1;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;

	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void addfirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isempty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {

		Node node = new Node(data, null);

		if (this.isempty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	public int getfirst() throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");

		}
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");

		}
		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");

		}
		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index");
		}
		return this.getNodeAt(index).data;
	}

	public Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index");
		}
		Node temp = this.head;
		int count = 0;
		while (count < index) {
			temp = temp.next;
			count++;
		}
		return temp;

	}

	public void addAt(int index, int data) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index");
		}
		if (index == 0) {
			this.addfirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(index - 1);
			Node node = new Node(data, nm1.next);
			nm1.next = node;
			Node next = node;
			this.size++;
			return;
		}

	}

	public int removeFirst() throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");

		}
		int rv = this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}

	public int removeLast() throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");

		}
		int rv = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nm2 = this.getNodeAt(this.size - 2);
			this.tail = nm2;
			this.tail.next = null;
		}
		this.size--;
		return rv;
	}

	public int removeAt(int index) throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");

		}
		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index");
		}
		if (index == 0) {
			return this.removeFirst();
		} else if (index == this.size - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(index - 1);
			int rv = nm1.next.data;
			nm1.next = nm1.next.next;
			this.size--;
			return rv;
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("End");
	}

	public void reverseDI() throws Exception {
		int beg = 0, end = this.size - 1;
		while (beg <= end) {
			Node left = this.getNodeAt(beg);
			Node right = this.getNodeAt(end);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			beg++;
			end--;

		}
	}

	public void reversePI() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node tprev = prev;
			Node tcurr = curr;
			prev = curr;
			curr = curr.next;
			tcurr.next = tprev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePR() {
		reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {
		Node n;
		if (node == this.tail) {
			return;
		}
		reversePR(node.next);
		node.next.next = node;
	}

	public int mid() {
		Node n = this.head;
		Node m = this.head;
		while (m.next != null && n.next.next != null) {
			n = n.next;
			m = m.next.next;
		}

		return n.data;

	}

	public int kthNodeFromEnd(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("invalid k");
		}
		Node n = this.head;
		Node m = this.head;
		for (int i = 0; i < k; i++) {
			m = m.next;
		}
		while (m.next != null) {
			n = n.next;
			m = m.next;
		}

		return n.data;

	}

	public void creatCycle() throws Exception {
		Node temp = this.getNodeAt(3);
		this.tail.next = temp;
	}

	public boolean detectcycle() {
		Node n = this.head;
		Node m = this.head;
		while (m.next != null && n.next.next != null) {
			n = n.next;
			m = m.next.next;
			if (m == n) {
				return true;
			}
		}

		return false;

	}

	public void reverseDR() {
		HeapMover obj = new HeapMover(this.head);
		this.reverseDR(obj, this.head, 0);
	}

	private void reverseDR(HeapMover obj, Node right, int index) {
		if (right == null) {
			return;
		}
		reverseDR(obj, right.next, index + 1);
		if (index >= this.size / 2) {
			int temp = obj.node.data;
			obj.node.data = right.data;
			right.data = temp;
			obj.node = obj.node.next;
		}
	}

	class HeapMover {
		Node node;

		public HeapMover(Node node) {
			this.node = node;
		}
	}

	public boolean ispalindrom() {
		int i = 0;
		Node current = head;
		Node temp = head;

		while (temp != null) {
			temp = temp.next;
			i++;
		}

		int[] arr1 = new int[i];
		int count = i;

		for (int j = 0; j < count; j++) {
			arr1[j] = current.data;
			current = current.next;
		}

		int[] arr2 = new int[count];
		int z = 0;

		for (int x = i - 1; x >= 0; x--) {
			arr2[z] = arr1[x];
			z++;
		}

		for (int x = 0; x < count; x++) {
			if (arr1[x] != arr2[x]) {
				return false;
			}
		}
		return true;
	}

	public void merge_sorted_list(LinkedList other) throws Exception {

		LinkedList ll = new LinkedList();
		Node temp = this.head;

		int temp2 = other.getfirst();
		while (temp != null && other.size() != 0) {
			if (temp.data < temp2) {
				ll.addLast(temp.data);
				temp = temp.next;
			} else {
				ll.addLast(other.removeFirst());
				temp2 = other.getfirst();
			}

		}

		while (temp != null) {
			ll.addLast(temp.data);
			temp = temp.next;
		}

		while (other.size() > 0) {
			ll.addLast(other.removeFirst());

		}
		ll.display();
	}

	public void partition() throws Exception {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node currentNode = head;

		while (currentNode != null) {
			int element = currentNode.data;

			if (element % 2 != 0) {

				if (evenStart == null) {
					evenStart = currentNode;
					evenEnd = evenStart;
				} else {
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}

			} else {

				if (oddStart == null) {
					oddStart = currentNode;
					oddEnd = oddStart;
				} else {
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}

			currentNode = currentNode.next;
		}

		if (oddStart == null || evenStart == null) {
			return;
		}

		evenEnd.next = oddStart;
		oddEnd.next = null;
		head = evenStart;
	}

	public void reverse(int k) {

		Node st1 = this.head;
		Node st2 = null;
		Node n1 = this.head;
		Node n2 = n1.next;
		Node n3 = n2.next;
		for (int i = 0; i < this.size; i++) {
			// System.out.println("here");
			if (i == k - 1) {
				this.head = n1;
			}
			if (i + k == this.size) {
				this.tail = n1;
			}
			if (n2 != null) {
				n3 = n2.next;
			}
			if ((i + 1) % k != 0) {
				n2.next = n1;
			} else {
				if ((i + 1) % 2 * k == 0) {
					if (st1 != null) {
						// System.out.println(st1.data);
						st1.next = n1;
					}
					st1 = n2;
				} else {
					// System.out.println("st2");
					if (st2 != null) {
						st2.next = n1;
					}
					st2 = n2;
				}
			}

			n1 = n2;
			n2 = n3;

		}
		if (st1 != null) {
			st1.next = null;
		}
		if (st2 != null) {
			st2.next = null;
		}

	}

	public void appendLastN(int n) throws Exception {
		if (n > size || n < 0) {
			System.out.println("n is out of range!");
			return;
		}
		Node ptr = head;
		int index = size - n - 1;
		if (index == -1) {
			return;
		}
		while (index > 0) {
			ptr = ptr.next;
			index--;
		}
		tail.next = head;
		head = ptr.next;
		tail = ptr;
		ptr.next = null;
	}

	public Node nth(int n) {
		if (head == null || n < 1)
			return null;

		Node n1 = head;
		Node n2 = head;
		for (int i = 1; i < n; i++) {
			if (n1.next == null)
				return null;
			n1 = n1.next;
		}

		while (n1.next != null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		return n2;
	}
	public LinkedList merge(LinkedList other) {
		LinkedList ans = new LinkedList();
		Node thishead = this.head;
		Node otherhead = other.head;

		while (thishead != null && otherhead != null) {
			if (thishead.data < otherhead.data) {
				ans.addLast(thishead.data);
				thishead = thishead.next;
			} else {
				ans.addLast(otherhead.data);
				otherhead = otherhead.next;
			}
		}

		while (thishead != null) {
			ans.addLast(thishead.data);
			thishead = thishead.next;
		}

		while (otherhead != null) {
			ans.addLast(otherhead.data);
			otherhead = otherhead.next;
		}

		return ans;
	}
	public static void sum(LinkedList l1, LinkedList l2, LinkedList l3, int target) {
		for (Node p1 = l1.head; p1 != null; p1 = p1.next) {
			for (Node p2 = l2.head; p2 != null; p2 = p2.next) {
				for (Node p3 = l3.head; p3 != null; p3 = p3.next) {
					if (p1.data + p2.data + p3.data == target) {
						System.out.println(p1.data + " " + p2.data + " " + p3.data);
						break;
					}
				}
			}
		}
	}
	public void delLesserNodes() 
	    { 
	        Node current = head; 
	  
	        /* Initialise max */
	        Node maxnode = head; 
	        Node temp; 
	  
	        while (current != null && current.next != null) { 
	            /* If current is smaller than max, then delete 
	               current */
	            if (current.next.data > maxnode.data) {
	            	 temp = current.next; 
		                current.next = temp.next; 
		                temp = null; 
	            	 
	            } 
	  
	            /* If current is greater than max, then update 
	               max and move current */
	            else { 
	            	current = current.next; 
	                maxnode = current; 
	               
	            } 
	        } 
	    } 
	  public static Node foldList(Node head) {
		  System.out.println();
		  return fold(head, head);
		 }

		 private static Node fold(Node head, Node curr) {
		  if (curr == null)
		   return head;

		  Node result = fold(head, curr.next);

		  
		  if (result != head || curr.next == null) 
		  {
		 
		   if (result != curr && result.next!=curr) 
		   {
		    curr.next = result.next;
		    result.next = curr;
		    return curr.next;
		   }
		   curr.next = null;
		  }
		  return head;
		 }
			public Node reverse2(int k){

			     if(head == null) {
			           return head;
			        }
			    
			        Node newHead = null;
			        
			        while(head != null) {
			            Node next = head.next;
			            head.next = newHead;
			            newHead = head;
			            head = next;
			        }
			        
			        return newHead;
			    
				}
				
}
