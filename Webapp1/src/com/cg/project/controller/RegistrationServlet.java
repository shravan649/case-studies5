package com.cg.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();

	}

	public void init() throws ServletException {

	}

	public void destroy() {

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String password=request.getParameter("password");
		String reenterPassword=request.getParameter("re-enterpassword");
		String gender=request.getParameter("gender");
		String mobileNumber=request.getParameter("mobileNumber");
		String email=request.getParameter("email");
		String [] communication=request.getParameterValues("communication");
		String graduation=request.getParameter("graduation");
		String description=request.getParameter("description");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1><font color='green'>First Name=</font>"+firstName);
		writer.println("<h1><font color='green'>Last Name=</font>"+lastName);
		writer.println("<h1><font color='green'>Password=</font>"+password);
		writer.println("<h1><font color='green'>Re-enter Password=</font>"+reenterPassword);
		writer.println("<h1><font color='green'>Gender=</font>"+gender);
		writer.println("<h1><font color='green'>Mobile Number=</font>"+mobileNumber);
		writer.println("<h1><font color='green'>EmailId=</font>"+email);
		writer.println("<h1><font color='green'>Communication=</font>");
		for(int i=0;i<communication.length;i++)
		writer.println(communication[i]);
		writer.println("<h1><font color='green'>Graduation=</font>"+graduation);
		writer.println("<h1><font color='green'>Description=</font>"+description);
		writer.println("</body>");
		writer.println("</html>");
	}

}