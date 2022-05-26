/*Write a program to display information about the database and list all the tables
in the database.
 (Use DatabaseMetaData)
 */
import java.sql.*;
public class database {

	public static void main(String[] args)  throws Exception{
	Class.forName("org.postgresql.Driver");
	
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","postgres","root");
	 
	DatabaseMetaData dmd=conn.getMetaData();
	
	System.out.println("Database Driver Name=" +dmd.getDriverName());
	System.out.println("Database product name:" +dmd.getDatabaseProductName());
	System.out.println("Username" +dmd.getUserName());
	System.out.println("Driver Version" +dmd.getDriverVersion());
	
	ResultSet rs =dmd.getTables(null, null, null, new String[] {"TABLE"});
	 System.out.println("List of Table...");
	 while(rs.next()) {
		 String tName=rs.getString("TABLE_NAME");
		 System.out.println("Tables:" +tName);
		 
	 }
	 conn.close();
		
	}
}