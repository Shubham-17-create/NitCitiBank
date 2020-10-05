package classprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException, IOException {
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:system/shubham@localhost:1521:xe");
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery("select * from empclob");
		 while(rs.next()){
			 		String ename = rs.getString(2);
			 		System.out.println(rs.getInt(1)+"\t"+ename+"\t"+rs.getInt(3));
			 		Reader r = rs.getCharacterStream(4);
			 		File f = new File("C:\\Users\\shubham\\Desktop\\"+ename+".txt");
			 		FileWriter fw  = new FileWriter(f);
			 		int i = 0;
			 		while((i=r.read())!=-1){
			 				fw.write(i);
			 		}
			 		fw.flush();
			 		
		 }
	}

}
