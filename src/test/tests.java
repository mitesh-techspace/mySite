package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class tests extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException { 
		
		response.setContentType("text/html");
		
		RequestDispatcher rd =  request.getRequestDispatcher("\\pages\\Test.html");
		rd.forward(request, response);
		
		/*
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		  
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Welcome to servlet");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
		*/
	}
		
}
