package lecture16;

import java.util.*;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.left = left;
			this.right = right;
			this.data = data;

		}
	}

	private Node root;
	private int size;
	private Node node;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for left child of" + parent.data);
			} else {
				System.out.println("Enter the data for right child of" + parent.data);

			}
		}

		int data = s.nextInt();
		Node node = new Node(data, null, null);
		this.size++;

		System.out.println("Do you have left child of" + node.data);
		boolean choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}

		System.out.println("Do you have right child of" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}

		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		{
			if (node == null) {
				return 0;
			} else {
				int s = ((size2(node.left)) + 1 + size2(node.right));
				return s;
			}
		}

	}

	public int maxBtree() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return 0;
		}
		int m = node.data;
		int lres = max(node.left);
		int rres = max(node.right);
		if (lres > rres) {
			m = lres;
		}
		if (lres < rres) {
			m = rres;
		}
		return m;

	}

	public int minBtree() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int m = node.data;
		int lres = min(node.left);
		int rres = min(node.right);
		if (lres < rres) {
			m = lres;
		}
		if (lres > rres) {
			m = rres;
		}
		return m;

	}

	public void preorder() {
		this.preorder(this.root);
		System.out.println();
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);

	}

	void inorder() {
		this.inorder(this.root);
		System.out.println();
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);

	}

	void postorder() {
		this.postorder(this.root);
		System.out.println();
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");

	}

	void levelorder() {
		this.levelorder(this.root, 0);
		System.out.println();
	}

	private void levelorder(Node node, int level) {
		if (node == null) {
			return;
		}
		if (level == 1) {
			System.out.print(node.data + " ");
		}

	}

	public boolean isBST() {
		return isBTS(this.node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBTS(Node node, int min, int max) {
		if (this.node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		} else if (!isBTS(node.left, min, node.data)) {
			return true;
		} else if (!isBTS(node.right, node.data, max)) {
			return true;
		} else {
			return true;
		}
	}

	public int sumOfNodes() {
		return this.sumOfNodes(this.root);
	}

	private int sumOfNodes(Node node) {

		int sum, sumLeft, sumRight;
		sum = sumRight = sumLeft = 0;

		if (root == null) {
			System.out.println("Tree is empty");
			return 0;
		} else {

			if (node.left != null)
				sumLeft = sumOfNodes(node.left);

			if (node.right != null)
				sumRight = sumOfNodes(node.right);

			sum = node.data + sumLeft + sumRight;
			return sum;
		}

	}

	public boolean structurallyIdentical(BinaryTree other) {
		return this.structurallyIdentical(this.root, other.root);
	}

	private boolean structurallyIdentical(Node tnode, Node onode) {

		if (tnode == null && onode == null)
			return true;

		if (tnode == null && onode == null)
			return true;

		if (tnode != null && onode != null) {

			return ((tnode.data == onode.data) && (structurallyIdentical(tnode.left, onode.left))
					&& (structurallyIdentical(tnode.right, onode.right)));
		}
		return false;
	}

	

	

}
