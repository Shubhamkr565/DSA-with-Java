//You are given an array of N integers. You need to print Yes if 42 is present in array, else print No.

package DSA_Array;

import java.util.Scanner;

public class EqualOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.println("Enter element of array: ");
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean found42 = false;
		for(int i=0;i<num;i++) {
			if(arr[i]==42) {
				found42 = true;
				break;
			}
		}
		if(found42) {
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
		
		
		
	}
}
