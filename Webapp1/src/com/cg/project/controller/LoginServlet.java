package com.cg.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.UserBean;
@WebServlet(value={"/LoginServlet"},loadOnStartup=1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
   @Override
	public void init() {
		ServletContext servletContext=getServletContext();
		con=(Connection)servletContext.getAttribute("con");
	}
	public void destroy() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username=request.getParameter("userName");
			String password=request.getParameter("password");
			RequestDispatcher dispatcher;
			UserBean userBean=new UserBean(username,password);
			PreparedStatement pstmt=con.prepareStatement("select password from userBean where userName=?");
			pstmt.setString(1, userBean.getUserName());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				if(rs.getString("password").equals(userBean.getPassword())){
					dispatcher=request.getRequestDispatcher("successPage.jsp");
					request.setAttribute("userBean",userBean);
					dispatcher.forward(request, response);
				}
				else{
					dispatcher=request.getRequestDispatcher("errorPage.jsp");
					request.setAttribute("errorMessage", "password is wrong");
					dispatcher.forward(request, response);
				}
			}
				else{
					dispatcher=request.getRequestDispatcher("errorPage.jsp");
					request.setAttribute("errorMessage", "password is wrong");
					dispatcher.forward(request, response);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}























//		PrintWriter writer=response.getWriter();
/*		String username=request.getParameter("userName");
		String password=request.getParameter("password");
		RequestDispatcher dispatcher;
		UserBean userBean=new UserBean(username,password);
		if(userBean.getUserName().equals("shravan")&&userBean.getPassword().equals("1234")){
			dispatcher=request.getRequestDispatcher("SuccessServlet");
			request.setAttribute("userBean",userBean);
			dispatcher.forward(request, response);
		}
		else{
			dispatcher=request.getRequestDispatcher("ErrorServlet");
			request.setAttribute("errorMessage", "UserName or password is wrong");
			dispatcher.forward(request, response);
		}
	}
}	*/




















/*			writer.println("<html>");
			writer.println("<head>");
			writer.println("</head>");
			writer.println("<body>");
			if(username.equals("shravan")&&password.equals("1234")){
				writer.println("<font color='olive'>username=</font>"+username);
				writer.println("<font color='olive'>password=</font>"+password);				
			}
			else{
//			if(!username.equals(password)){
				writer.println("username and password are incorrect");
				writer.println("<h1><font color='red'>username=</font>"+username);
				writer.println("</h1>");
				writer.println("<h2><font color='red'>password=</font>"+password);
				writer.println("</h2>");					
			}
			writer.println("</body>");
			writer.println("</html>");


		/*		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<body>");
		writer.println("<div align='center'>");
		writer.println("<h1>Hello  </h1>");
		writer.println("<h2>");
		writer.println("username="+username+"\n"+"password="+password);
		writer.println("</h2>");
		writer.println("</div>");
		writer.println("</head>");
		writer.println("</body>");
		writer.println("</html>");
	}
}*/