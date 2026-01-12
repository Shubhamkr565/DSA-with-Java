package DSA_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ex {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//add element
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		//get element
		
		int get = list.get(1);
		System.out.println(get);
		
		//add element in between
		list.add(0, 5);
		list.add(5, 50);
		System.out.println(list);
		
		
		//set element
		
		list.set(2, 15);
		System.out.println(list);
		
		//delete element
		list.remove(5);
		System.out.println(list);
		
		
		//size
		int size =list.size();
		System.out.print(size);
		
		//loops
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//sorting
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
