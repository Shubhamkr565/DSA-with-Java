package Queue;

public class All_Queue {

	private Node first;
	private Node last;
	private int length;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public void Enqueue2(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			first = newNode;
			last = newNode;
			length = 1;
		}
	}
	
	public void display() {
		if(length == 0) {
			System.out.println("Node is Empty:");
		}else {
			Node temp = first;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			first = newNode;
			last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	public void Dequeue() {
		if(length == 0) {
			System.out.println("Queue is Empty:");
		}else {
			Node temp = first;
			first = first.next;
			temp = null;
		}
		length--;
	}
	
	public static void main(String[] args) {
		All_Queue print = new All_Queue();
		
		print.push(10);
		print.push(20);
		print.push(30);
		print.push(40);
		print.push(50);
		
		print.display();
		
		System.out.println("After remove first Node:");
		print.Dequeue();
		print.display();
	}
	
	
	
	
	
}
