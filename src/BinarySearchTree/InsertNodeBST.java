/*
 					50
			20				70
		10		30		60		80

 */

package BinarySearchTree;

public class InsertNodeBST {

	int data;
	InsertNodeBST left;
	InsertNodeBST right;
	
	InsertNodeBST (int data, InsertNodeBST left, InsertNodeBST right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	InsertNodeBST (int data, InsertNodeBST left, InsertNodeBST right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	InsertNodeBST (int data, InsertNodeBST left, InsertNodeBST right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public static InsertNodeBST createRandomBinarySearchTree() {

		InsertNodeBST left3 = new InsertNodeBST(60, null, null);
		InsertNodeBST right3 = new InsertNodeBST(80, null, null);

		InsertNodeBST left2 = new InsertNodeBST(10, null, null);
		InsertNodeBST right2 = new InsertNodeBST(30, null, null);

		InsertNodeBST left1 = new InsertNodeBST(20, left2, right2);
		InsertNodeBST right1 = new InsertNodeBST(70, left3, right3);

		InsertNodeBST root = new InsertNodeBST(50, left1, right1);
		return root;
	}
	 
	public static InsertNodeBST insertNode(InsertNodeBST root, int key) {
		InsertNodeBST temp = new InsertNodeBST(key);
		
		if (root == null) {
			root = temp;
		}
		
		else {
			if (temp.data <= root.data) {
				insertNode(root.left, key)
			}
			else {
				insertNode(root.right, key)
			}
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
