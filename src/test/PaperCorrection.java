package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaperCorrection extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String AnsQ1 = request.getParameter("OptionQ1");
		
		
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		  
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println(AnsQ1);  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
		
	}
	

}
