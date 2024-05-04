package Linked_list;

public class RemoveLast {

	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public RemoveLast(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node remove() {
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		Node temp = head;
		Node ptr = head;
		
		while(temp.next!=null) {
			ptr = temp;
			temp = temp.next;
		}
		tail = ptr;
		tail.next = null;
		length--;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return tail;
	}
	
	
	public void getHead() {
		System.out.println("Head: "+ head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: "+ tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: "+ length);
	}
	
	public static void main(String[] args) {
		RemoveLast print = new RemoveLast(10);
		
		print.add(20);
		print.add(30);
		print.getHead();
		print.getTail();
		print.getLength();
		
		
		System.out.println("Remove Item: "+print.remove().value);
		print.display();
		
		
		
	}
}









