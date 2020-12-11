package classprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void check(int[] k, int checkValue){
    	boolean test = false ;
    	 for (int element : k) {
			    if (element == checkValue) {
			    	test = true;
			        break;
			    }
			} 
    	// Print the result 
         System.out.println("Is " + checkValue 
                            + " present in the array: " + test); 
        }

	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of element");
		int length = s.nextInt();
    	int [] k= new int[length];
		
		System.out.println("enter the elements in array");
		
		for(int i=0; i<length; i++ ) {
	         k [i] = s.nextInt();
	      }
		 System.out.println(Arrays.toString(k));
		 System.out.println("Enter no to check");
		 int checkValue=s.nextInt();
		 check(k,checkValue);
	}
	                
}
