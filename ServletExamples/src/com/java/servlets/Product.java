package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");    
	    PrintWriter out = response.getWriter();
	 
	   			         // extract the client data from req object.  Infact, this is actually to be done by S1 
	    String str1 = request.getParameter("t1");
	    double num1 = Double.parseDouble(str1);
	                                 
	                                 // for second number, above two steps in one step
	    double num2 = Double.parseDouble(request.getParameter("t2"));   
	 
	                                // now left is multiplication
	    double result = num1 * num2;
	                                 
	                                 // prepare response.  This response will go to the client directly (and not to S1)
	    out.println("Your first number: " + num1);  
	    out.println("<br>Your second number: " + num2);  
	    out.println("<br>Their product is " + result);
	 
	    out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
