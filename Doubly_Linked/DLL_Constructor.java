package Doubly_Linked;

public class DLL_Constructor {

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
	
	public void DLL_Constructor(int value) {
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
		}
	}
	
	public static void main (String[] args) {
		DLL_Constructor print = new DLL_Constructor();
		print.DLL_Constructor(10);
		print.display();
	}
	
	
}
