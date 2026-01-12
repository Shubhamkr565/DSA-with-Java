package Stack;

public class Push {

	private Node top;
	private int heigth;
	
	class Node{
		int value;
		Node next;
		
		Node (int value){
			this.value = value;
		}
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		top = newNode;
		heigth = 1;
	}
	
	public void display() {
		if(heigth == 0) {
			System.out.println("Stack is Empty: ");
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
	
	
	public static void main(String[] args) {
		Push print = new Push();
		
		print.pushData(10);
		print.pushData(20);
		print.pushData(30);
		
		print.display();
	}
}
