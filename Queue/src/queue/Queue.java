package queue;

public class Queue {
	int front, rear, size;
	int que[];
	int capacity;

	public Queue(int capacity) {
		this.capacity = capacity;
		this.que = new int[capacity];
		this.size = -1;
		this.front = 0;
		this.rear = -1;
	}

	public void insert(int data) {
		if (isFull()) {
			System.out.println("Queue is full.");
			return;
		} else {
			rear++;
			if (rear == capacity - 1)
				rear = 0;
		}
		que[rear] = data;
		size++;
	}

	public void peek() {
		if (isEmpty())
			System.out.println("Queue is empty.");
		else
			System.out.println("Last insertd element: " + que[rear]);
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void print() {
		System.out.println("Queue elements are: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(que[i] + " ");
		}
		System.out.println();
	}

	public void remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		} else {
			System.out.println(que[rear] + " is removed.");
			front++;
			size--;
		}
	}

	public boolean isEmpty() {
		return this.size == 0;
	}
}
