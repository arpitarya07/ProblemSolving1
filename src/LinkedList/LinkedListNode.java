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
}
