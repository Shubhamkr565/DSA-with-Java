package Doubly_Linked;

public class DLL_add {

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
		DLL_add print = new DLL_add();
		
		print.DLL_add(10);
		print.add(20);
		print.add(30);
		print.add(40);
		print.add(50);
		
		
		print.display();
	}
}








