package DSA_Array;

import java.util.Arrays;

public class ArrayApp {

	private Object[] or;
	private int index=0;
	
	
	public ArrayApp(int capacity) {
		
		or = new Object[capacity];
		
	}
	
	
	public ArrayApp() {
		
		or = new Object[10];
		
	}
	
	
	public void add(Object obj) {
		or[index]=obj;
		index++;
		
	}
	
	
	@Override
	public String toString() {
	
		
		Object[] or2 = new Object[index];
		
		for(int i=0;i<index;i++) {
			
			or2[i]=or[i];
		}
		
		return Arrays.toString(or2);
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		
		ArrayApp list = new ArrayApp();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
