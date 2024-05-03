//You are given an arr which has N integers.
//Write a program to print the ceil of average of integers present in the array.

package DSA_Array;

import java.util.Scanner;

public class AverageOfAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int avg =0;
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array element: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		}
		avg = sum/n;
		System.out.println("Avg of integer present in array is "+ avg);
	}
		
}
