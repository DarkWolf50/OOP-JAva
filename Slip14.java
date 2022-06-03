<%-- Write a JSP program to display the details of PATIENT 
(PatientNo, PatientName, PatientAddress, Patientage,PatientDiease) in tabular form on browser --%>
<%@ page import="java.sql.*" %>
<%@ page language="java" %>
<%
try{
	
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/rbnb","postgresql","mayur");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from patient");
	out.println("<table border=1>");
	out.println("<tr><th>Patient_ID</th><th>Patient_name</th><th>Patient_addr</th><th>Patient_age</th><th>Patient_disease</th></tr>");
	while(rs.next()){
		out.println("<tr> <td"+rs.getInt(1));
		out.println(" <td"+rs.getString(2));
		out.println(" <td"+rs.getString(3));
		out.println(" <td"+rs.getInt(4));
		out.println(" <td"+rs.getInt(5));
	}
	out.println("</table>");
	
}catch (Exception e)
{
	out.println("Error::"+e);
}





%>