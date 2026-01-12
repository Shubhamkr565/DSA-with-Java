package Linked_list;

public class Linked_list1 {
	
	private Node head;
	private Node tail;
	private int lenght;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	public Linked_list1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		int length = 1;
		
	}
	
	public void printlist() {
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
		System.out.println("Tail: " + tail.value);
	}
	
	public void getLenght() {
		System.out.println("Length: "+ lenght);
	}
}