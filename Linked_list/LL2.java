package Linked_list;

public class LL2 {
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public LL2(int data) {
		Node newNode = new Node(data);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	public void printdata() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head = "+ head.data);
	}
	public void getTail() {
		System.out.println("Tail = "+ tail.data);
	}
	public void getLength() {
		System.out.println("Length = "+ length);
	}
	public static void main(String[] args) {
		LL2 mylist = new LL2(10);
		
		mylist.getHead();
		mylist.getTail();
		mylist.getLength();
		
		mylist.printdata();
	}
	
	
}