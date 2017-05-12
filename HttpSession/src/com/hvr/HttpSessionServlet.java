package com.hvr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HttpSessionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try{  
			  
	        resp.setContentType("text/html");  
	        PrintWriter out = resp.getWriter();  
	          
	        String n=req.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        HttpSession session=req.getSession();  
	        session.setAttribute("uname",n);  
	  
	        out.print("<a href='servlet2'>visit</a>");  
	                  
	        out.close();  
	  
	    }
		catch(Exception e){System.out.println(e);}  
	}
}
