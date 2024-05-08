package Doubly_Linked;

public class All_Doubly_Link_List {

	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value = value;
		}
	}
	public void All_Doubly_Link_List(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
		if(length == 0) {
			System.out.println("Node is empty:");
			return;
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	public void removeLast() {
		if(length == 0) {
			System.out.println("Node is Empty:");
			return;
		}else {
			Node temp = tail;
			tail = tail.prev;
			tail.next= null;
			temp.prev = null;
		}
		length--;
	}
	
	public void removeFirst() {
		if(length == 0) {
			System.out.println("Node is Empty:");
			return;
		}else {
			Node temp = head;
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
	}
	
	public void get(int index) {
		if(index < 0 || index > length-1) {
			System.out.println("Index not in the range:");
		}
		Node temp = head;
		if(index < length/2) {
			for(int i=0; i<index; i++) {
				temp = temp.next;
			}
		}else {
			temp = tail;
			for(int i = length-1; i> index; i--) {
				temp = temp.prev;
			}
		}
		System.out.println("Index no: "+ index + " value: "+ temp.value);
	}
	
	public void set(int index , int value) {
		if(index < 0 || index > length-1) {
			System.out.println("Index not in the range:");
		}
		Node temp = head;
		if(index < length/2) {
			for(int i=0; i<i	; i++) {
				temp = temp.next;
			}
		}else {
			temp = tail;
			for(int i=length-1; i> index; i--) {
				temp = temp.prev;
			}
		}
		if(temp!=null) {
			temp.value = value;
		}
	}
	
	public static void main(String[] args) {
		All_Doubly_Link_List print = new All_Doubly_Link_List();
		
		print.All_Doubly_Link_List(10);
		print.addLast(20);
		print.addLast(30);
		print.addLast(40);
		print.addFirst(5);
		print.addFirst(2);
		print.display();
		System.out.println("After remove first:");
		print.removeFirst();
		print.display();
		System.out.println("After remove last:");
		print.removeLast();
		
		print.get(3);
		print.display();
		print.set(1, 100);
		print.display();
	}
}

















