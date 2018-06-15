package com.cg.project.listners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ProjectListners implements ServletContextListener {
	private Connection con;

	public void contextDestroyed(ServletContextEvent event)  { 
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con=null;
	}
	public void contextInitialized(ServletContextEvent event)  { 
		try {
			ServletContext servletContext=event.getServletContext();
			String driver=servletContext.getInitParameter("driver");
			String url=servletContext.getInitParameter("url");
			String user=servletContext.getInitParameter("user");
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, "");
			servletContext.setAttribute("con",con );
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}