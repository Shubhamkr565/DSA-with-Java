package Linked_list;

public class LLaddLast {

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
	
	public  LLaddLast(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
		Node temp = head;
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
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(length==0) {
			head = newNode;
			tail = newNode;
		}else
		{
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public static void main(String[] args) {
		LLaddLast print = new LLaddLast(5);
		
		print.add(10);
		print.add(20);
		
		print.getHead();
		print.getTail();
		print.getLength();
		
		print.display();
	}
	
}
