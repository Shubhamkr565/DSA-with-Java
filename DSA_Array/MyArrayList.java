package DSA_Array;

import java.util.Scanner;

public class MyArrayList {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array:");
		int x = sc.nextInt();
		int[] arr1 = new int[x];
		for(int i=0;i<x;i++) {
		System.out.println("Enter number of Element:");
		arr1[i] = sc.nextInt();
		
		}
		for(int i=0;i<x;i++) {
			
			System.out.println(arr1[i]);
		
		}
		
		
	}
}
