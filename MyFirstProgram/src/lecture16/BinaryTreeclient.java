package lecture16;



public class BinaryTreeclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      BinaryTree tree=new BinaryTree();
      tree.display();
//      System.out.println(tree.size2());
//      System.out.println(tree.maxBtree());
//      System.out.println(tree.minBtree());
//      tree.preorder();
//      tree.inorder();
//      tree.postorder();
//      tree.levelorder();
      System.out.println(tree.isBST());
	}

}// 50 true 25 true 12 false false true 51 false false true 75 true 62 false false true 87 false false

