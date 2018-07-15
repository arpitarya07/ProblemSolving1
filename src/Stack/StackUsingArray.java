package Stack;

public class StackUsingArray {

	int top;
	int stack[];
	int size;
	
	public StackUsingArray() {
		// TODO Auto-generated constructor stub
		size = 3;
		stack = new int[size];
		top = -1;		
	}

	public StackUsingArray(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	// push, pop, peek, isempty, traverse
	
	public void push(int value) {
		if (top == size-1) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			stack[top] = value;
			System.out.println("Pushed value "+stack[top]+" to index "+top);
		}
	}
	
	public int pop() {
		int value = Integer.MIN_VALUE;
		if (top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(stack[top]+" deleted");
			value = stack[top];
			top--;
		}
		return value;
	}
	
	public int peek() {
		int value = Integer.MIN_VALUE;
		if (top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(stack[top]+" is peek value");
			value = stack[top];
		}
		return value;
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public void traverse() {
		if (top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			for(int i=0; i<=top; i++) {
				System.out.println(stack[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray obj1 = new StackUsingArray();
		StackUsingArray obj2 = new StackUsingArray(20);
		
		obj1.push(1);
		obj1.push(2);
		obj1.push(3);
		obj1.push(4);
		
		int x = obj1.pop();
		int y = obj1.pop();
		int z = obj1.pop();
		int a = obj1.pop();
		
		obj1.push(1);
		obj1.push(2);
		obj1.push(3);
		
		obj1.traverse();
		
		int peekValue = obj1.peek();
		System.out.println(peekValue);
		
		boolean b = obj1.isEmpty();
		System.out.println(b);
		int s = obj1.size(); 
		System.out.println(s);
	}

}
