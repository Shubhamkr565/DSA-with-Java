package Doubly_Linked;

public class Get_index3 {

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
	public void Get_index3(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void display() {
		if(length == 0) {
			System.out.println("Node is Empty:");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
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
	
	public void getindex(int index) {
		Node temp = head;
		if(index < 0 || index >= length) {
			System.out.println("Index number doesn't match:");
		}
			if(index < length/2) {
			
			for(int i=0; i<index; i++) {
				temp = temp.next;
			}
			System.out.println("Index number: "+ index + " and value: "+ temp.value);
			}
		else {
			temp = tail;
			for(int i=length-1; i>index; i--) {
				temp = temp.prev;
			}
		}
		System.out.println("Index number: "+ index + " and value: " + temp.value );
		
	}
	
	
	public static void main(String[] args) {
		Get_index3 print = new Get_index3();
		
		print.add(10);
		print.add(20);
		print.add(30);
		print.add(40);
		print.add(50);
		print.add(60);
		
		
		print.getindex(5);
		print.display();
	}
	
}
