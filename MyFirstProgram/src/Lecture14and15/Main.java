package Lecture14and15;

import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public ArrayList<ArrayList<Integer>> levelArrayList() {

			  ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
		        if(root==null) return result; 
		        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
		        list.add(root);
		        while(!list.isEmpty())
		        {
		            ArrayList<TreeNode> Tplist=new ArrayList<TreeNode>();
		            ArrayList<Integer> level=new ArrayList<Integer>();
		            while(!list.isEmpty())
		            {
		                TreeNode node=list.remove(0);
		                level.add(node.val);
		                if(node.left!=null) Tplist.add(node.left);
		                if(node.right!=null) Tplist.add(node.right);
		            }
		            result.add(level);
		            list=Tplist; 
		        }
		        return result; 
		    }
		}

	}

}
