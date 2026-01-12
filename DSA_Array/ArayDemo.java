package DSA_Array;

public class ArayDemo {

	public static void main(String[] args) {
		
		// declares an array of integers
		int[] array;
		
		 // allocates memory for 5 integers
		array = new int[5];
		
		// initialize first element
		array[0] = 10;
		// initialize second element
		array[1] = 20;
		  // and so forth
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Element at index "+i+" : " + array[i]);
		}
	}
}


//The output from this program is:
//
//Element at index 0: 10
//Element at index 1: 20
//Element at index 2: 30
//Element at index 3: 40
//Element at index 4: 50