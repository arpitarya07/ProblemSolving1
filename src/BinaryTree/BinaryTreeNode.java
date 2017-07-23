/*
 					5
			10				15
		20		25		30		35
	40
 
 */

package BinaryTree;

import java.lang.Math;

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
	
	/*
		5
10				15
20		25		30		35
40

*/
	
	public static int sizeOfBinaryTree(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int count1 = sizeOfBinaryTree(root.left);
		int count2 = sizeOfBinaryTree(root.right);
		return (count1+count2+1);		
	}
	
	public static int heightOfBinaryTree(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int count1 = heightOfBinaryTree(root.left);
		int count2 = heightOfBinaryTree(root.right);
		return (Math.max(count1, count2) + 1);	
	}
	
	public static boolean rootToLeafSumBT(BinaryTreeNode root, int sum) {
		
		if (root == null) {
			return false;
		}
		
		int rootData = Integer.parseInt(root.data);
		
		if (root.left == null && root.right == null) {
			if (rootData == sum) {
				System.out.println(rootData);
				return true;
			}
				return false;
		}
		
		sum = sum - rootData;
		boolean left = rootToLeafSumBT(root.left, sum);
		boolean right = rootToLeafSumBT(root.right, sum);
		
		if (left || right) {
			System.out.println(rootData);
			return true;
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
		
		int sizeOfBinaryTree = sizeOfBinaryTree(root);
		System.out.println(sizeOfBinaryTree);

		int heightOfBinaryTree = heightOfBinaryTree(root);
		System.out.println(heightOfBinaryTree);

		boolean rootToLeafSumBT = rootToLeafSumBT(root, 40);
		System.out.println(rootToLeafSumBT);
		// System.out.println(this.data);
		
	}

}
