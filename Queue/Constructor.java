package Queue;

public class Constructor {

	private Node first;
	private Node last;
	private int heigth;
	
	class Node{
		int value;
		Node next;
		
		Node (int value){
			this.value = value;
		}
	}
	
	public void Queue(int value) {
		Node newNode = new Node(value);
		if(heigth == 0) {
			first = newNode;
			last = newNode;
			heigth = 1;
		}
	}
	
	public void display() {
		if(heigth == 0) {
			System.out.println("Queue is Empty:");
		}else {
			Node temp = first;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Constructor print = new Constructor();
		
		print.display();
	}
	
	
	
	
	
	
	
}
