package Linked_list;

public class getMethod {

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
	
	public void getIndex(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
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
	
	public Node get(int index) {
		if(index < 0 || index >=length) {
			System.out.println("Node is emmpty: ");
			return null;
		}
		Node temp = head;
		for(int i=0 ; i<index; i++) {
			temp = temp.next;
		}
		System.out.println(temp.value);
		return temp;
	}
	
	public static void main(String[] args) {
		getMethod print = new getMethod();
		print.add(10);
		print.add(20);
		print.add(30);
		print.add(40);
		
		print.getHead();
		print.getTail();
		print.getLength();
		print.display();
		
		System.out.println("Index value: "+print.get(2).value);
		print.get(2);
		
		
		
	}
}

