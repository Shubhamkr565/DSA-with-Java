package DSA_Array;

public class SumOfTwoArray {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40};
		
		int[] arr2 = {50,60,70,80};
		
		int sum;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				sum = arr1[i]+arr2[j];
				System.out.println(sum);
				i++;
			}
		}
	}
}
