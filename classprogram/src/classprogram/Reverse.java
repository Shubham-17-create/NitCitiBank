package classprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Reverse{
	
	public static void main(String[] args) {
		  
		
			 Scanner scan = new Scanner(System.in);
			 System.out.println("Enter the String");
			 String str = scan.next();
			 char[] charray=str.toCharArray();
			 
	//		System.out.print(ch[0]);
			 List<Character> vowels = new ArrayList<>();
			 List<Character> nonvowels = new ArrayList<>();
			 
			 for(char ch:charray){
				 if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) {
					 vowels.add(ch);
					 
					 System.out.print(vowels);
					
			}
				 else if ((ch>='a' && ch<='z')&&!(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )){
                         
					     nonvowels.add(ch);
                          System.out.print(nonvowels);
				}

				// for(char c :vowels) 
				//	 System.out.print("vowels"+c);	 
				 
			 }
		
	}

}