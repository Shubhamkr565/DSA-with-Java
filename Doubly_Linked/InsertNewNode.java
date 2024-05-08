package Doubly_Linked;

public class InsertNewNode {

	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public void InsertNewNode(int value) {
		Node newNode = new Node(value);
		
			head = newNode;
			tail = newNode;
			length = 1;
		
	}
	public void display() {
		if(length == 0) {
			System.out.println("Node is empty:");
		}
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
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
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= length) {
			System.out.println("Index number not in the range:");
		}
		Node temp = head;
		if(index < length/2) {
			for(int i=0; i< index-1; i++) {
				temp = temp.next;
			}
		}else {
			temp = tail;
			for(int i=length-1; i> index; i--) {
				temp = temp.prev;
			}
			
		}
		return temp;
		}
		
	
		public void insert(int index , int value) {
			if(index < 0 || index >= length) {
				System.out.println("Index number not in the range:");
			}
			if(index == 0) {
				addFirst(value);
			}
			if(index == length-1) {
				add(value);
			}
			Node newNode = new Node(value);
			Node before = get(index-1);
			Node after = before.next;
			
			newNode.prev = before;
			newNode.next = after;
			before.next = newNode;
			after.prev = newNode;
			length++;
		}
		
		public static void main(String[] args) {
			InsertNewNode print = new InsertNewNode();
			
			print.add(10);
			print.add(20);
			print.add(30);
			print.add(40);
			
			print.display();
			System.out.println("After insert new Node: \n");
			print.insert(1, 250);
			print.display();
		}
}

















