//You are given a number n, you need to find the sum all the even numbers which are less than equal to n.

package DSA_Array;

import java.util.Scanner;

public class Sum_of_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to find the sum of all even number : ");
		int Num =  sc.nextInt();
		
		int sum = 0;
		
		for(int i=0;i<=Num; i++) {
			if(i%2==0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of the all even number between 1 to "+ Num + " is " + sum);
		
		
		
	}
}
