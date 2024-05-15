package Queue;

public class Enqueue {

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
	
	public void Enqueue(int value) {
		Node newNode = new Node(value);
		if(heigth == 0) {
			first = newNode;
			last = newNode;
			heigth =1;
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
	
	public static void main(String[] args) {
		Enqueue print = new Enqueue();
		
		print.Enqueueadd(10);
		print.Enqueueadd(20);
		
		print.display();
	}
	
	
}
