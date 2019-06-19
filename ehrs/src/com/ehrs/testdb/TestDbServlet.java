package com.ehrs.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username="DESKTOP-H5NI3P9\\FIKA";
		String password="";
		String jdbcUrl="jdbc:sqlserver://localhost:1433;databaseName=ehrs_db";
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String connectionUrl ="jdbc:sqlserver://localhost:1433;databaseName=ehrs_db;user=DESKTOP-H5NI3P9\\FIKA;password=";
		try {
			PrintWriter out = response.getWriter();
			out.println("connecting to the database"+jdbcUrl);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectionUrl);
			out.println("CONNECTION SUCCESS");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
