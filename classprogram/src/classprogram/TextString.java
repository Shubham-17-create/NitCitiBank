package classprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextString {

	public static void main(String[] args) throws IOException {
		
		    FileReader fr= new FileReader("C:\\Users\\shubham\\Desktop\\shubham.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String str;
            
            while ((str=br.readLine())!= null) {
           	String s1=str.replaceAll("[^\\Sa-zA-Z0-9]", "");
            //	int s1=str.length();
            //	 int s2=str.replace("h", "").length();
			//	 System.out.println(s1-s2);
           	     System.out.println(s1.charAt(30));
           	     int count = 1;

           	     for (int i = 0; i <s1.length()-1; i++) {
           	    	 if ((s1.charAt(i)='')  &&  (s1.charAt(i+1)!='')) {
     					count++;
     				}
					
				}
           	    
           	     
			}
            br.close();
            
	}

}
