package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Capitals
 */
@WebServlet(name = "Capitals", urlPatterns = { "/Capitals" }, initParams = {
		@WebInitParam(name = "Andhra", value = "Amaravathi"), @WebInitParam(name = "Telangana", value = "Hyderabad"),
		@WebInitParam(name = "TamilNadu", value = "Chennai") })
public class Capitals extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Capitals() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Capital of Andhra is:" + getInitParameter("Andhra") + "<br/>");
		out.println("Capital of Telangana is:" + getInitParameter("Telangana") + "<br/>");
		
		out.println("Capital of India is:" + getServletContext().getInitParameter("India") + "<br/>");
		out.println("Capital of Srilanka is:" + getServletContext().getInitParameter("Srilanka") + "<br/>");

		out.println("Reading all values of config parameters:" + "<br>");
		Enumeration<String> e = getServletConfig().getInitParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement(); 
			String value = getServletConfig().getInitParameter(name); 
																		
			out.println("<br>" + name + " : " + value);
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
