package Stack;

public class Constructor {

	private Node top;
	private int heigth;
	
	class Node{
		int value;
		Node next;
		
		Node (int value){
			this.value = value;
		}
	}
	public void Constructor(int value) {
		Node newNode = new Node(value);
		top = newNode;
		heigth = 1;
	}
	public void display() {
		if(heigth == 0) {
			System.out.println("Stack is empty:");
		}else {
			Node temp = top;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Constructor print = new Constructor();
		
		print.Constructor(110);
		
		print.display();
		
		
	}
	
}

