package classprogram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int num= scan.nextInt();
          
          int temp=num;
          int rev=0;
          
          while(num!=0) {
        	  rev=rev*10 + num%10;
        	  num=num/10;
        	  
          }
          if(temp==rev) {
        	  System.out.println("palindrome");
          }
          else {
        	  System.out.println("not");
          }
          System.out.println(rev);
         
          
        //  StringBuffer sb= new StringBuffer(String.valueOf(num));
        //  StringBuffer s= sb.reverse();
        //	  System.out.println(s);

	}

}
