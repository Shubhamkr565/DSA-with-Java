//Given an array, arr which has N integers.
//You need to print the smallest and largest element present in the array each on new lines

package DSA_Array;

import java.util.Scanner;

public class SamllestAndLargestOfAll {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i=0;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
	
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
	
		int[] arr = new int[n];
		
		System.out.println("Enter element of array: ");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++) {
			System.out.println("Element of array index "+(i)+" = " +arr[i]);
		}
		
		
		for(i=0;i<n;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("Smallest number present in array is = "+ smallest);
		System.out.println("Smallest number present in array is = "+ largest);
		
		
		
		
		
	}
}
