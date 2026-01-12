package Doubly_Linked;

public class Remove_first {

	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node prev;
		
		Node (int value){
			this.value = value;
		}
	}
	
	public void DLL_add(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
		if(length == 0) {
			System.out.println("Node is Empty: ");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
			length++;
		}
	}
	
	public void remove_first() {
		Node temp = head;
		if(length == 0) {
			System.out.println("Node is empty: ");
		}
		if(length == 1) {
			head = null;
			tail = null;
		}else {
			head.next = head;
			head.prev = null;
			temp.next = null;
			
		}
		length--;
		//System.out.println(temp.value);
	}
	
	public void add(int value) {
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
	
	public static void main(String[] args) {
		Remove_first print = new Remove_first();
		
		print.DLL_add(10);
		print.add(20);
		print.display();
		print.remove_first();
		print.remove_first();
		print.remove_first();
		print.display();
	}
}
