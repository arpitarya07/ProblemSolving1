/*
 					50
			20				70
		10		30		60		80

 */

package BinarySearchTree;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTreeNode {
	
	int data;
	BinarySearchTreeNode left;
	BinarySearchTreeNode right;
	
	BinarySearchTreeNode (int data) {
		this.data = data;
	}
	
	BinarySearchTreeNode (int data, BinarySearchTreeNode left, BinarySearchTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	

	public static void printBST(BinarySearchTreeNode root, int count) {
		if (root == null) {
			for (int i = 0; i < count; i++) {
				System.out.print("\t");
			}
			System.out.println("null");
		} else {

			for (int i = 0; i < count; i++) {
				System.out.print("\t");
			}
			System.out.println(root.data);

			int temp = count + 1;
			printBST(root.left, temp);
			printBST(root.right, temp);
		}
	}// end of printBST()
	
	 public static BinarySearchTreeNode createRandomBinarySearchTree(){
			 
			 BinarySearchTreeNode left3 = new BinarySearchTreeNode(60, null, null);
			 BinarySearchTreeNode right3 = new BinarySearchTreeNode(80, null, null);

			 BinarySearchTreeNode left2 = new BinarySearchTreeNode(10, null, null);
			 BinarySearchTreeNode right2 = new BinarySearchTreeNode(30, null, null);	

			 BinarySearchTreeNode left1 = new BinarySearchTreeNode(20, left2, right2);
			 BinarySearchTreeNode right1 = new BinarySearchTreeNode(70, left3, right3);

			 BinarySearchTreeNode root = new BinarySearchTreeNode(50, left1, right1);
			 return root;
		}
	
	public static BinarySearchTreeNode searchBST(BinarySearchTreeNode root, int key) {
		// searchBST(50,60)
		// searchBST(70,60)
		// searchBST(60,60)

		if (root == null) { // 1
			return null;
		}

		else if (root.data == key) { // 2
			return root;
		}

		else {
			if (key < root.data) { // 3
				BinarySearchTreeNode search = searchBST(root.left, key);
				// search = searchBST(60,60) = 60
				return search;
			} else { // 4

				BinarySearchTreeNode search = searchBST(root.right, key);
				// search = searchBST(70,60) = 60;
				return search;

			}
		}

	}
	
	public static BinarySearchTreeNode insertNode(BinarySearchTreeNode root, int key) {
		BinarySearchTreeNode temp = new BinarySearchTreeNode(key);
		
		if (root == null) {
			root = temp;
		}
		
		else {
			if (temp.data <= root.data) {
				root.left = insertNode(root.left, key);
			}
			else {
				root.right = insertNode(root.right, key);
			}
		}
		
		return root;
	}
	
	public static BinarySearchTreeNode insertNodeIteration(BinarySearchTreeNode root, int key) {
		BinarySearchTreeNode newNode = new BinarySearchTreeNode(key);
		BinarySearchTreeNode temp = root;
		BinarySearchTreeNode parent = root;
		
		if (root == null) {
			root = newNode;
		}
		
		while (temp != null) {
			
			parent = temp;
			
			if (newNode.data <= temp.data) {
				temp = temp.left;
			}
			else {
				temp = temp.right;
			}
		}
		
		if (newNode.data <= parent.data) {
			parent.left = newNode;
		}
		else {
			parent.right = newNode;
		}
		
		return root;
		
	}
	
	public static boolean checkBST(BinarySearchTreeNode root, int l, int u) {
		if (root == null) {
			return true;
		}
		
		if (root.left == null && root.right == null) {
			return true;
		}
		
		if (root.data < l && root.data > u) {
			return false;
		}
		
		boolean leftResult = checkBST(root.left, l, root.data);
		boolean rightResult = checkBST(root.right, root.data, u);
		return (leftResult && rightResult);
	}
	
	public static void printLevelOrderTraversal(BinarySearchTreeNode root) {
		Queue<BinarySearchTreeNode> q = new LinkedList<BinarySearchTreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek().data);
			root = q.peek();
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
			q.remove();
		}
	}
	
	public static void iterativePostOrderTraversal(BinarySearchTreeNode root) {
		Stack<BinarySearchTreeNode> st1 = new Stack<BinarySearchTreeNode>();
		Stack<BinarySearchTreeNode> st2 = new Stack<BinarySearchTreeNode>();
		
		if (root == null) {
			System.out.println("Root is null");
		}
		
		st1.push(root);
		
		while(!st1.isEmpty()) {
			root = st1.pop();
			st2.push(root);
			if (root.left != null) {
				st1.add(root.left);
			}
			
			if (root.right != null) {
				st1.add(root.right);
			}			
		}
		
		while(!st2.isEmpty()) {
			System.out.println(st2.peek().data);
			st2.pop();			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeNode root = createRandomBinarySearchTree();
		System.out.println();
		
		//BinarySearchTreeNode search = searchBST(root, 60);
		//System.out.println(search.data);
		
		//BinarySearchTreeNode result = insertNode(root, 25);
		
		BinarySearchTreeNode bstInsertionIter = insertNodeIteration(root, 25);
		
		printBST(root,0);
		
		boolean checkBST = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(checkBST);
		
		printLevelOrderTraversal(root);
		System.out.println("================================");
		iterativePostOrderTraversal(root);
	}

}
