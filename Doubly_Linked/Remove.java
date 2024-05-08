package Doubly_Linked;

public class Remove {

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
	
	public void Remove(int value) {
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
	
	
	public Node get(int index) {
		if(index < 0 || index >= length) {
			System.out.println("Index number not in the range:");
			return null;
		}
		Node temp = head;
		if(index < length/2) {
			for(int i=0; i< index; i++) {
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
		
		public void removeFirst() {
			Node temp = head;
			if(length == 0) {
				System.out.println("Node is empty: cannot remove any Node.");
			}else {
				head = head.next;
				head.prev = null;
				temp.next = null;
			}
			length--;
		}
		
		public void removeLast() {
			Node temp = tail;
			if(length == 0) {
				System.out.println("Node is empty: cannot remove any Node.");
			}else {
				tail = tail.prev;
				tail.next = null;
				temp.prev = null;
			}
			length--;
		}
		
		public void remove(int index) {
			if(index < 0 || index >= length) {
				System.out.println("Index number not in the range:");
				return;
			}
			if(index == 0) {
				removeFirst();
				return;
			}
			if(index == length-1) {
				removeLast();
				return;
			}
			Node temp = get(index);
			Node before = get(index-1);
			Node after = get(index+1);
			
			before.next = after;
			after.prev = before;
			
			temp.prev = null;
			temp.next = null;
			length--;
			
		}
	
		
		public static void main(String[] args) {
			Remove print = new Remove();
			
			print.add(10);
			print.add(20);
			print.add(30);
			print.add(40);
			
			print.display();
			System.out.println("After remove Node: \n");
			print.remove(2);
			print.display();
			
		}

}
