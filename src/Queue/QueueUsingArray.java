package Queue;

public class QueueUsingArray {
	int front, rear, size;
	int queue[];
	
	public QueueUsingArray() {
		// TODO Auto-generated constructor stub
		front = -1;
		rear = -1;
		size = 3;
		queue = new int[size];
	}

	public boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear == size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (isEmpty()) {
			front=rear=0;
		}
		else {
			rear++;
		}
		queue[rear] = value;
		System.out.println("Inserted element is: "+value);
	}
	
	public void deQueue() {
		int deletedValue;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		deletedValue = queue[front];
		if (front == rear) {
			front=rear=-1;
		}
		else {
			front++;
		}
		System.out.println("Deleted element is: "+deletedValue);
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		System.out.println("Peek element is: "+queue[rear]);
		return queue[rear];
	}
	
	public void traverse() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			for(int i=front; i<=rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray obj1 = new QueueUsingArray();
		obj1.enQueue(1);
		obj1.enQueue(2);
		obj1.enQueue(3);
		obj1.deQueue();
		obj1.peek();
		obj1.traverse();
	}

}
