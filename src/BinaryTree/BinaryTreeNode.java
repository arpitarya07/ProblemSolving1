/*
 					5
			10				15
		20		25		30		35
	40
 
 */

package BinaryTree;

public class BinaryTreeNode {

	String data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode (String data, BinaryTreeNode left, BinaryTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
		
		System.out.println(this.data);
	}
	
	public static BinaryTreeNode generateTree() {
		
		BinaryTreeNode left4 = new BinaryTreeNode("40", null, null);
		
		BinaryTreeNode left3 = new BinaryTreeNode("30", null, null);
		BinaryTreeNode right3 = new BinaryTreeNode("35", null, null);
		
		BinaryTreeNode left2 = new BinaryTreeNode("20", left4, null);
		BinaryTreeNode right2 = new BinaryTreeNode("25", null, null);		
		
		BinaryTreeNode left1 = new BinaryTreeNode("10", left2, right2);
		BinaryTreeNode right1 = new BinaryTreeNode("15", left3, right3);
		
		BinaryTreeNode root = new BinaryTreeNode("5", left1, right1);	
		
		return root;
	}
	
	public static void preOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public static void inOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
	}
	
	public static void postOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}
	
	public static boolean sameBinaryTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		else if (root1 == null || root2 == null) {
			return false;
		}
		
		if (root1.data == root2.data) {
			boolean leftTree = sameBinaryTree(root1.left, root2.left);
			boolean rightTree = sameBinaryTree(root1.right, root2.right);
			return leftTree && rightTree;
		}
		return false;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = generateTree();
		System.out.println();
		root.preOrderTraversal(root);
		System.out.println();
		root.inOrderTraversal(root);
		System.out.println();
		root.postOrderTraversal(root);
		
		
		BinaryTreeNode root2 = generateTree();
		root2.right.right.data = "1000";
		boolean sameBinaryTree = sameBinaryTree(root, root2);
		System.out.println(sameBinaryTree);
		
		// System.out.println(this.data);
		
	}

}