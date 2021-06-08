package queue;

public class QueueMain {
	public static void main(String[] args) {	
		Queue queue = new Queue(10);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.print();
		queue.peek();
		System.out.println("Queue after remove operation:");
		queue.remove();
		queue.print();
	}
}
