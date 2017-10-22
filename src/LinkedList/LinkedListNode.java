/**
 * 
 */
package LinkedList;

/**
 * @author Arpit-PC
 *
 */
public class LinkedListNode {
	
	int data;
	LinkedListNode next;
	
	/**
	 * Default Constructor
	 * data = 0
	 * next = null
	 */
	public LinkedListNode() {
		this.data = 0;
		this.next = null;
	}
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public LinkedListNode(int data, LinkedListNode next) {
		this.data = data;
		this.next = next;
	}
	
	
	public static LinkedListNode createLinkedList() {
		//LinkedListNode eleventh = new LinkedListNode(10, null);
		LinkedListNode tenth = new LinkedListNode(10, null);
		LinkedListNode ninth = new LinkedListNode(9, tenth);
		LinkedListNode eighth = new LinkedListNode(8, ninth);
		LinkedListNode seventh = new LinkedListNode(7, eighth);
		LinkedListNode sixth = new LinkedListNode(6, seventh);
		LinkedListNode fifth = new LinkedListNode(5, sixth);
		LinkedListNode fourth = new LinkedListNode(4, fifth);
		LinkedListNode third = new LinkedListNode(3, fourth);
		LinkedListNode second = new LinkedListNode(2, third);
		LinkedListNode root = new LinkedListNode(1, second);
		return root;
	}
	
	public static void linkedListTraversal (LinkedListNode root) {
		if (root == null) {
			System.out.println("Root is null");
		}
		
		LinkedListNode temp = root;
		
		while(temp.next!=null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
		
		temp = root;
		int count = 0;
		while(temp.next != null) {
			System.out.print(count++ + "     ");
			temp = temp.next;
		}
		System.out.print(count);
	}
	
	public static void middleNodeInLL(LinkedListNode root) {
		if (root == null) {
			System.out.println("Root is null");
		}
		
		LinkedListNode middle = root;
		LinkedListNode current = root;
		int count = 0;
		
		while (current != null) {
		count++;
		if (count % 2 == 0) {
			middle = middle.next;
		}
		current = current.next;
		}
		System.out.println(middle.data);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListNode root = createLinkedList();
		linkedListTraversal(root);
		System.out.println();
		System.out.println("=======================");
		System.out.println("Middle Element of Linked List is:");
		middleNodeInLL(root);
	}

}
