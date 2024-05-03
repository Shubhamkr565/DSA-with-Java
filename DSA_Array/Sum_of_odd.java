//You are given a number n, you need to find the sum all the odd numbers which are less than equal to n.
package DSA_Array;

import java.util.Scanner;

public class Sum_of_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ");
		int N =  sc.nextInt();
		
		int sum = 0;
		
//		for(int i=1;i<=N;i +=2) {
//			
//				sum = sum+i;
//			
//		}
		
		for(int i=0;i<=N; i++) {
			if(i%2!=0) {
				sum = sum+i;
			}
			
		}
		System.out.println("Sum of the all odd number between 1 to "+ N + " is " + sum);
		
		
	}
	
}
