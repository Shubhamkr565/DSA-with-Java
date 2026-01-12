package Linked_list;

import Linked_list.getMethod.Node;

public class Insert {

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
	
	public void Insert(int value) {
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
			tail = newNode;
		}
		length++;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			System.out.println("Node is empty:");
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
	
	public Node get(int index) {
		if(index < 0 || index >=length) {
			
			return null;
		}
		Node temp = head;
		for(int i=0 ; i<index; i++) {
			temp = temp.next;
		}
		
		return temp;
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
	
	
	public static void main(String[] args) {
		Insert print = new Insert();
		
		
		
		print.add(10);
		print.add(20);
		print.add(30);
		print.add(40);
		
		print.display();
		System.out.println("After insert the new Node:");
		print.insert(2, 50);
		print.display();
	}
	
}
