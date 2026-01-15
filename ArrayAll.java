package DSA_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayAll {
	
	public static void main(String[] args) {
		
		
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		//Add elements
//		list.add(0);
//		list.add(2);
//		list.add(3);
//		
		
		
		
		
		List<Integer> list = List.of(0,2,3);

		
		
		
		System.out.println(list);
		//get elements
		int element = list.get(2);
		System.out.println(element);
		
		//add element in between 
		list.add(0, 15);
		System.out.println(list);
		
		//set elements
		list.set(0, 5);
		System.out.println(list);
		
		//delete element
		list.remove(3);
		System.out.println(list);
		
		//size
		int size = list.size();		
		System.out.println(size);
		
		//loops
		
		for(int i=0;i<list.size(); i++) {
			 System.out.print(list.get(i));
		}
		//sorting
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}
}
