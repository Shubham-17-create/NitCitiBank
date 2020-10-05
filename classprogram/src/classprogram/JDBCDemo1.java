package classprogram;
import java.sql.*;
import java.sql.Types;
public class JDBCDemo1 {

	public static void main(String[] args) throws SQLException {
		Connection  con = DriverManager.getConnection("jdbc:oracle:thin:system/shubham@localhost:1521:xe");
		Statement st = con.createStatement();
		
		/*	int count = st.executeUpdate("insert into studentmarks values (102,submarks(60,60,60))");
	        System.out.println(count+".record inserted");  */
			
			ResultSet rs = st.executeQuery("select * from studentmarks");
			System.out.println("SID \t \tSMARKS");
			while(rs.next()){ 
					System.out.println(rs.getInt(1)+"\t\t");
					Array obj= rs.getArray(2);
					ResultSet rs1= obj.getResultSet();
					while(rs1.next()){
							System.out.print(rs1.getInt(2)+"\t");
					}
					System.out.println();
				
			}
		
	}
     
}
