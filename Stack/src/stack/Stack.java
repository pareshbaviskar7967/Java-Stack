package stack;

public class Stack {
	int top = -1;
	private int stk[];

	public Stack() {
		this.top = -1;
		this.stk = new int[10];
	}

	public Stack(int maxSize) {
		this.top = -1;
		this.stk = new int[maxSize];
	}

	public boolean push(int data) {
		if (isFull()) {
			System.out.print("Stack overflow.");
			return false;
		} else {
			stk[++top] = data;
			System.out.println(data + " pushed into stack.");
			return true;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.print("Stack underflow.");
			return 0;
		} else
			return stk[top--];
	}

	public void peek() {
		if (isEmpty())
			System.out.print("Stack underflow.");
		else
			System.out.print("Top element: " + stk[top] + "\n");
	}

	public void print() {
		System.out.print("Elements of the stack are: \n");

		if (isEmpty())
			System.out.print("Stack underflow.");
		for (int i = 0; i <= this.top; i++)
			System.out.print(stk[i] + " ");

		System.out.println();
	}

	public boolean isEmpty() {
		return this.top < 0;
	}

	public boolean isFull() {
		return this.top >= stk.length - 1;
	}
}
