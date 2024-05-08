package Doubly_Linked;


public class DLL_remove_last {

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
	public void DLL_remove_last(int value) {
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
	public void removeLast() {
		Node temp = tail;
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		if(length == 1) {
			head = null;
			tail = null;
		}else {
		
		tail = tail.prev;
		tail.next = null;
		temp.prev = null;

		}
		length--;
	}
	
	public static void main(String[] args) {
		DLL_remove_last print = new DLL_remove_last();
		
		print.DLL_remove_last(10);
		print.add(20);
		
		print.display();
		print.removeLast();
		print.removeLast();
		
		print.display();
	}
}









