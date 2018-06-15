package com.cg.project.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sayHello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloServlet() {
        super();
    }
	public void init(ServletConfig config) throws ServletException {	
	
	}
	public void destroy() {		
	
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter writer=response.getWriter();
	writer.println("<html>");
	writer.println("<head>");
	writer.println("<body>");
	writer.println("<div align='center'>");
	writer.println("<font color = 'green' size = '25'>Hello World!!! </font>");
	writer.println("</div>");
	writer.println("</head>");
	writer.println("</body>");
	writer.println("</html>");

	}	
}