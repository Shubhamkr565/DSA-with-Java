package Linked_list;

public class RemoveFirst {

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
	public void Removefirst(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
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
	
	public void display() {
		Node temp = head;
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
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
	
	public void removeFirst() {
		if(length == 0) {
			System.out.println("Node is empty: ");
		}else {
			head = head.next;
		}
		length--;
	}
		
	
	public static void main(String[] args) {
		RemoveFirst print = new RemoveFirst();
		print.add(10);
		print.add(20);
		
		
		print.getHead();
		print.getTail();
		print.getLength();
		print.display();
		
		print.removeFirst();
		print.getHead();
		print.getTail();
		print.getLength();
		print.display();
		
	}
}
