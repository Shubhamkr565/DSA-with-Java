package Linked_list;

import java.util.Scanner;

public class D {

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
	
	public void D(int value) {
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
		length++;
		
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
	
	public void addfirst(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		}else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	public void addlast(int value) {
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
	
	public void removeFirst() {
		if(length == 0) {
			System.out.println("Node is empty: can't remove.");
		}else {
			head = head.next;
			
		}
		length--;
	}
	
	public void removeLast() {
		if(length == 0) {
			System.out.println("Node is Empty: ");
		}else {
			Node temp = head;
			Node ptr = head;
			while(temp.next!=null) {
				ptr = temp;
				temp = temp.next;
			}
			tail = ptr;
			tail.next = null;
			length--;
		}
		if(length == 0) {
			head = null;
			tail = null;
		}
	}
	
	public void getindex(int index) {
		if(index<0 || index >= length) {
			System.out.println("Index doesn't match:");
		}else {
		Node temp = head;
		for(int i=0; i< index; i++) {
			temp = temp.next;
			System.out.println("Index No "+ index + " value : "+temp.value);
		}
		}	
	}
	
	public void setMethod(int index , int value) {
		Node temp = head;
		if(index<0 || index >=length) {
			System.out.println("Index does'not match: ");
		}else {
			if(temp!=null) {
				temp.value = value;
				System.out.println("After change the index No: "+ index +", and value is  "+ value);
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		D print = new D();
		
		print.D(10);
		print.add(20);
		print.add(30);
		
		print.addfirst(5);
		print.addlast(50);
		print.display();
		System.out.println("After first Node removed:");
		print.removeFirst();
		print.display();
		System.out.println("After last Node removed:");
		print.removeLast();
		
		print.getindex(5);
		print.setMethod(1, 100);
		print.display();
	}
	
	
}