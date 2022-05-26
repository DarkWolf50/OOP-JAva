/*Write a program to display information about all columns in the donar table using ResultSetMetadata

 *  
 */
import java.sql.*;
public class donar {

	public static void main(String[] args)  throws Exception{
	Class.forName("org.postgresql.Driver");
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/rbnb","postgres","root");
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from donar1");
	ResultSetMetaData rs1= rs.getMetaData();
	int no=rs1.getColumnCount();
	System.out.println("total column:" +no);
	for(int i=1;i<=no;i++) {
		System.out.println("Column no:" +i);
		System.out.println("Column name:" +rs1.getColumnName(i));
		System.out.println("column type:" +rs1.getColumnTypeName(i));
		System.out.println("column name:" +rs1.getColumnDisplaySize(i));
		
	}
	conn.close();
	
	

	}

}