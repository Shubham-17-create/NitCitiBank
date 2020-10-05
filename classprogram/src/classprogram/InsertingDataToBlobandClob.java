package classprogram;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertingDataToBlobandClob {
   public static void main(String args[]) throws Exception {
      Connection  con = DriverManager.getConnection("jdbc:oracle:thin:system/shubham@localhost:1521:xe");
      System.out.println("Connection established......");
      //Inserting values
      int pid = 0;
      String pname = null;
      int price = 0;
      
    //  PreparedStatement pstmt = con.prepareStatement( "INSERT INTO product( VALUES (?, ?, ?,?,?))");
       PreparedStatement pstmt = con.prepareStatement( "select * from product");
         pstmt.setInt(1,pid);
		pstmt.setString(2,pname);
		pstmt.setInt(3,price);
		
      FileReader fileReader = new FileReader("C:\\Users\\shubham\\Desktop\\shubham.txt");
      pstmt.setClob(5, fileReader);
      InputStream inputStream = new FileInputStream(".jpg");
      pstmt.setBlob(4, inputStream);
      
    //  pstmt.setBinaryStream(2, fis,(int)f.length());
    //  pstmt.setCharacterStream(2, fr, (int)f.length());
		

       
     pstmt.execute();    
     
    
      System.out.println("Records inserted");
      
      con.close();
		pstmt.close();
		fileReader.close();
   }
}

	
