//Electricity consumption is measured via slab rates for a particular watt age capacity, which is as follows:
//Unit Consumed			Per Unit Price(Rupees/Unit)
//0-50					3
//51-150				5
//151 and above			10


package DSA_Array;

import java.util.Scanner;

public class Total_Bill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Unit consumed : ");
		int unit = sc.nextInt();

		int price = 0;
		
		
		for(int i=0;i<=unit;i++) {
			if(unit<=50) {
				price = 3*unit + 80;
			}else if(unit>=51 && unit<=150) {
				price = 5*(unit-50)+150 + 80;
			}else {
				price = 10*(unit-150)+500+150+80;
			}
		}
		
		
		System.out.println("Total unit consumed by user is "+ unit +" amout is " + price);
		
	}
}
