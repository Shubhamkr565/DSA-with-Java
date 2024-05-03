//You are provided the highest runs,N, ever scored in a cricket match till now, which is current highest record.
//You are also given current runs, M scored by Sachin(Tendulkar) in a to day,s match.
//
//1. if Sachin breaks current recored in that match, print Broken.
//2. if Sachin could not break that recored , print not Yet.
//3. if Sachin score exactly as current highest recored , print Wao.


package DSA_Array;

import java.util.Scanner;

public class BreakingARecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 200;
		
		System.out.println("Sachin current Highest run in ODI match : "+ N);
		
		System.out.println(" ");
		
		System.out.println("Enter Current Sachin Score in to-day match is");
		int M = sc.nextInt();
		
		System.out.println("Current Scored by Sachin is "+ M);
		
		if(M>N) {
			System.out.println("Broken");
		}else if(M<N) {
			System.out.println("Not Yet");
		}else {
			System.out.println("Wao");
		}
		
		
	}
}
