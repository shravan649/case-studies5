package com.cg.project.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.UserBean;

@WebServlet("/ErrorServlet")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean userBean=(UserBean)request.getAttribute("userBean");
//		String em=(String)request.getAttribute("errorMessage");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
//		writer.println(em);
		writer.println("<div align='center'><font color='red'>wrong username"+userBean.getUserName()+"wrong password"+userBean.getPassword());
		writer.println("</body>");
		writer.println("</html>");
	}

}