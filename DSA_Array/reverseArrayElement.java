package DSA_Array;

import java.util.Scanner;

public class reverseArrayElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		System.out.println("Enter Array element: ");
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("After reverse the element : ");
		
		int[] rev = new int[N];
		
		for(int i=N-1;i>=0; i--) {
			rev[N-1-i] = arr[i];
			
		}
		System.out.println("reverse the element : ");
		for(int i=0;i<N;i++) {
			System.out.println(rev[i]+ " ");
		}
		
	}
	
}
