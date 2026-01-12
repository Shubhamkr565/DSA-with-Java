package Linked_list;

public class Remove {

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
	
	public void Remove(int value) {
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
			System.out.println("Node is empty: ");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public Node removeLast() {
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		Node temp = head;
		Node ptr = head;
		while(temp.next!=null) {
			ptr = temp;
			temp = temp.next;
		}
		tail = ptr;
		tail.next = null;
		if(length == 0) {
			head = null;
			tail = null;
		}
		length--;
		return temp;
	}
	public Node get(int index) {
		if(index < 0 || index > length) {
			return null;
		}
		Node temp = head;
		for(int i=0; i<index ; i++) {
			temp = temp.next;
		}
		
		return temp;
	}
	
	public Node removefirst() {
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		head = head.next;
		return head;
	}
	
	public Node remove(int index) {
	if(index <0 || index > length) {
		return null;
	}
	if(index == 0) {
		return removefirst();
	}
	if(index == length-1) {
		return removeLast();
	}
	Node prev = get(index-1);
	Node temp = prev.next;
	
	prev.next = temp.next;
	temp.next = null;
	length--;
	return temp;
	}
	public static void main(String[] args) {
		Remove print = new Remove();
		
		print.add(10);
		print.add(20);
		print.add(30);
		
		print.display();
		
		System.out.println("remove One node:");
		print.remove(5);
		print.display();
	}
	
	
	
	
}
