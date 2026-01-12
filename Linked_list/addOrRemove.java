package Linked_list;

public class addOrRemove {
	
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
	
	public addOrRemove(int value) {
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
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLastNode() {
		if(length==0) return null;
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
		return temp;
	}
	
	public static void main(String[] args) {
		addOrRemove print = new addOrRemove(100);
		
		print.add(200);
		
		
		print.getHead();
		print.getTail();
		print.getLength();
		
		print.display();
		System.out.println("remove last item: " + print.removeLastNode().value);
	}
}
