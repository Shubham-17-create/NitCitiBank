//program to find smallest number in array
package classprogram;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[] = {5,9,3,2,1};
//		System.out.println("enter the elements in array");
//		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
	  	int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if (min > arr[i]) {
				min=arr[i];
				
			}
			
		}
		System.out.println(min);
       
	}

}
