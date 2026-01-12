package Queue;

public class Dequeue {

	private Node first;
	private Node last;
	private int heigth;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public void Dequeue(int value) {
		Node newNode = new Node(value);
		if(heigth == 0) {
			first = newNode;
			last = newNode;
			heigth = 1;
		}
	}
	
	public void display() {
		if(heigth == 0) {
			System.out.println("Queue is Empty:");
		}else {
			Node temp = first;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	
	public void Enqueueadd(int value) {
		Node newNode = new Node(value);
		if(heigth == 0) {
			first = newNode;
			last = newNode;
		}else {
			last.next = newNode;
			last  = newNode;
		}
		heigth++;
	}
	
	
	public void remove() {
		if(heigth == 0) {
			System.out.println("Queue is Empty:");
		}
		if(heigth == 1) {
			first = null;
			last = null;
		}
		else {
			Node temp = first;
			first = first.next;
			temp.next = null;
		}
		heigth--;
	}
	
	public static void main(String[] args) {
		Dequeue print = new Dequeue();
		
		print.Enqueueadd(10);
		print.Enqueueadd(20);
		
		print.display();
		System.out.println("After remove first item:\n");
		print.remove();
		
		print.display();
	}
	
	
	
	
	
}
