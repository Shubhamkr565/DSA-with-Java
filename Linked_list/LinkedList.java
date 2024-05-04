package Linked_list;

public class LinkedList {

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
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	public void getHead() {
		System.out.println("Head  = "+head.value);
	}
	public void getTail() {
		System.out.println("Tail  = "+ tail.value);
	}
	public void getLength() {
		System.out.println("Length = "+ length);
	}
	
	public static void main(String[] args) {
		LinkedList mylinkedList = new LinkedList(5);
		
		mylinkedList.getHead();
		mylinkedList.getTail();
		mylinkedList.getLength();
		
		mylinkedList.printList();
	}
	
	
}
