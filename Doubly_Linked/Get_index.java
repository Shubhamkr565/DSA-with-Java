package Doubly_Linked;

public class Get_index {

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
	
	public void Get_index(int value) {
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
	
	public void getIndex(int index) {
		
		if(index <0 || index >=length) {
			System.out.println("Index out of the range:");
		}else {
			Node temp = head;
			for(int i=0; i<index; i++) {
				temp = temp.next;
			}
			System.out.println("Index No:" + index +" value: "+temp.value);
		}
		
	}
	
	
	public static void main(String[] args) {
		Get_index print = new Get_index();
		
		print.Get_index(10);
		print.add(20);
		print.add(30);
		print.add(40);
		print.getIndex(3);
		print.getIndex(2);
		System.out.println("\n");
		print.display();
	}

}
