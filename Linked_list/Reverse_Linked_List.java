package Linked_list;

public class Reverse_Linked_List {

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
	
	public void Reverse_Linked_List(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
		if(length == 0) {
			System.out.println("Node is Empty:");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
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
	
	public void reverse() {
		if(length == 0) {
			System.out.println("Node is empty: ");
			return;
		}
		Node temp = head;
		head = tail;
		tail = temp;
		
		Node after = temp.next;
		Node before = null;
		
		for(int i=0; i<length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	public static void main(String[] args) {
		Reverse_Linked_List print = new Reverse_Linked_List();
		print.add(10);
		print.add(20);
		print.add(30);
		print.add(40);
		print.add(50);
		print.add(60);
		
		print.display();
		System.out.println("After reverse the Node: \n");
		print.reverse();
		
		print.display();
	}
	
	
	
	
}
