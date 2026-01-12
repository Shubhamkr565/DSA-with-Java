package Linked_list;

public class All_Linked_list {
	
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
	
	public void All_Linked_list(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
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
		System.out.println("Tail: "+ tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: "+ length);
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
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			System.out.println("Node is empty:");
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	
	public Node Removefirst() {
		if(length == 0) {
			System.out.println("Node is empty:");
		}
		head = head.next;
		return head;
	}
	
	public Node RemoveLastNode() {
		if(length==0) return null;
		Node temp = head;
		Node ptr = head;
		
		while(temp.next!=null) {
			ptr = temp;
			temp = temp.next;
		}
		tail = ptr;
		tail.next = null;
		length--;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	
	public Node remove(int index) {
		if(index <0 || index > length) {
			return null;
		}
		if(index == 0) {
			return Removefirst();
		}
		if(index == length-1) {
			return RemoveLastNode();
		}
		Node prev = get(index-1);
		Node temp = prev.next;
		
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;
		}
	
	public Node get(int index) {
		if(index < 0 || index >=length) {
			System.out.println("Node is emmpty: ");
			return null;
		}
		Node temp = head;
		for(int i=0 ; i<index; i++) {
			temp = temp.next;
		}
		System.out.println(temp.value);
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp!=null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
public boolean insert(int index, int value) {
		
		if(index < 0 || index > length) {
			return false;
		}
		if(index ==0) {
			addFirst(value);
		}
		if(index == length) {
			addLast(value);
		}
		Node newNode = new Node(value);
		Node temp = get(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
		
	}
	
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	public static void main(String[] args) {
		All_Linked_list print = new All_Linked_list();
		
		print.add(100);
		print.add(200);
		print.add(300);
		
		print.addFirst(50);
		print.addLast(400);
		
		print.Removefirst();
		print.RemoveLastNode();
		print.remove(2);
		
		print.get(0);
		print.set(0,10);
		
		print.insert(2,50);
		
		print.getHead();
		print.getTail();
		print.getLength();
		
		print.display();
		
//		print.reverse();
//		print.getHead();
//		print.getTail();
//		print.getLength();
//		
//		print.display();
//		
		
	}
}
