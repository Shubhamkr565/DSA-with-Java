package Stack;

public class Pop {

	private Node top;
	private int heigth;
	
	class Node{
		int value;
		Node next;
		
		Node (int value) {
			this.value = value;
		}
	}
	
	public void Push(int value) {
		Node newNode = new Node(value);
		if(heigth == 0) {
			top = newNode;
		}else {
			newNode.next = top;
		}
		heigth++;
	}
	
	public void display() {
		if(heigth == 0) {
			System.out.println("Stack is Empty:");
		}else {
			Node temp = top;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	
	public void pushData(int value) {
		Node newNode = new Node(value);
		if(heigth == 0) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
		heigth++;
	}
	
	public void pop() {
		if(heigth == 0) {
			System.out.println("Stack is Empty:");
		}else {
			Node temp = top;
			top = temp.next;
			temp.next = null;
		}
		heigth--;
	}
	
	public static void main(String[] args) {
		Pop print = new Pop();
		
		print.pushData(10);
		print.pushData(20);
		print.pushData(30);
		print.pushData(40);
		print.pushData(50);
		print.pushData(60);
		
		print.display();
		System.out.println("After pop element: \n");
		print.pop();
		print.display();
	}
	
	
	
	
	
	
	
}
