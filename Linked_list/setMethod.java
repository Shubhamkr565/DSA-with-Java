package Linked_list;

public class setMethod {

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
	
	public void setMethod(int value) {
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
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public Node get(int index) {
		if(index < 0 || index >= length) {
			System.out.println("Index value not match:");
			return null;
		}
		Node temp = head;
		for(int i=0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp!=null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		setMethod print = new setMethod();
		
		print.add(10);
		print.add(20);
		print.add(30);
		print.add(40);
		print.add(50);
		

		print.set(1, 15);
		print.display();
	}
	
}
