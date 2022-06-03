/*Design a servlet that provides information about a HTTP request from a client, such as IP 
address and browser type. The servlet also provides information about the server on 
which the servlet is running, such as the operating system type, and the names of 
currently loaded servlets.*/

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servlet_client extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		String user=req.getHeader("User-Agent");
		PrintWriter pw=res.getWriter();
		pw.println("<br>Server Name:"+req.getServerName());
		pw.println("<br>Server Port:"+req.getServerPort());
		pw.println("<br>IP Address:"+req.getRemoteAddr());
		pw.println("<br>Client Browser:"+req.getHeader("User-agent"));
	}
}