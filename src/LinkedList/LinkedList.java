package LinkedList;

public class LinkedList {

	LinkedListNode root;

	public LinkedList(LinkedListNode root) {
		// TODO Auto-generated constructor stub
		this.root = root;
	}

	public static LinkedListNode createLinkedList() {
		// LinkedListNode eleventh = new LinkedListNode(10, null);
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

	public void linkedListTraversal() {
		if (root == null) {
			System.out.println("Root is null");
		}

		LinkedListNode temp = root;

		while (temp.next != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

		temp = root;
		int count = 0;
		while (temp.next != null) {
			System.out.print(count++ + "     ");
			temp = temp.next;
		}
		System.out.print(count);
	}

	public LinkedListNode middleNodeInLL() {
		if (root == null) {
			System.out.println("Root is null");
			return null;
		}

		LinkedListNode middle = root;
		LinkedListNode current = root;

		while (current != null && current.next!=null) {
			middle = middle.next;
			current = current.next.next;
		}
		System.out.println("\n\nMiddle Element of Linked List is: " + middle.data);
		return middle;
	}

	public void insertionAtBeginning(LinkedListNode node) {
		if (root == null) {
			root = node;
		} 
		else {
			node.next = root;
			root = node;
		}
		System.out.println("\nInserted node at the beginning is: "+root.data);
	}
	
	public void insertionAtEnd(LinkedListNode node) {
		if (root == null) {
			root = node;
		} 
		else {
			LinkedListNode temp = root;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = node;
		}
		System.out.println("\nInserted node at the end is: "+node.data);
	}
	
	public void insertionAtMiddle(LinkedListNode node) {
		if (root == null) {
			root = node;
		} 
		else {
			LinkedListNode temp = root;
			while(temp.next.data!=9) {
				temp=temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
		System.out.println("\nInserted node at the middle is: "+node.data);
	}
	
	public void deletionAtBeginning() {
		if (root == null) {
			System.out.println("Root is null");
		} 
		else {
			System.out.println("\nDeleted node at the beginning is: "+root.data);
			root = root.next;
		}
	}
	
	public void deletionAtEnd() {
		if (root == null) {
			System.out.println("Root is null");
		} 
		else {
			LinkedListNode temp = root;
			LinkedListNode prev = root;
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			prev.next = null;
			System.out.println("\nDeleted node at the end is: "+temp.data);
		}
	}
	
	public void deletionAtMiddle(LinkedListNode node) {
		if (root == null) {
			System.out.println("Root is null");
		} 
		else {
			LinkedListNode temp = root;
			LinkedListNode prev = root;
			while(temp.next.data!=node.data) {
				prev=temp;
				temp=temp.next;
			}
			System.out.println("\nDeleted node at the middle is: "+temp.data);
			prev.next = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode node1 = new LinkedListNode(50, null);
		LinkedListNode node2 = new LinkedListNode(60, null);
		LinkedListNode node3 = new LinkedListNode(70, null);
		LinkedListNode root = createLinkedList();
		LinkedList rootLL = new LinkedList(root);

		rootLL.insertionAtBeginning(node1);
		rootLL.insertionAtEnd(node2);
		rootLL.insertionAtMiddle(node3);
		
		rootLL.deletionAtBeginning();
		rootLL.deletionAtEnd();
		rootLL.deletionAtMiddle(node3);
		
		rootLL.linkedListTraversal();
		rootLL.middleNodeInLL();

		System.out.println();
		System.out.println("=======================");

	}

}
