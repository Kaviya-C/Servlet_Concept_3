package com.http.coding;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet  extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException ,IOException
	{
//		int first = Integer.parseInt(request.getParameter("number-1"));
//		
//		int second =Integer.parseInt(request.getParameter("number-2"));
//		
//		int results= first+second;
//		
//		request.setAttribute("added", results);
//		RequestDispatcher rd =  request.getRequestDispatcher("squaring");
//		rd.forward(request, response);
		
		
		int first = Integer.parseInt(request.getParameter("number-1"));
		
		int second =Integer.parseInt(request.getParameter("number-2"));
		
		int k= first+second;
		
		/*
		 * sendRedirect()    
		 * how do we this without using RequestDispatcher
		 */
		
		
		/* there are 3 ways to do this:
		transfer data from one server to another server
		session 
		cookies
		 url rewritting
		*/
		 
		 
		/* this is one way to redirect to this page ...
		response.sendRedirect("squaring?addResults="+addResults);
		above is called url rewritting
		*/
		
		
		/*
		 * session method 
		 * HttpSession is an interface
		 */
		
//		HttpSession session = request.getSession();
//		session.setAttribute("k",k);
//		response.sendRedirect("squaring");
		
		
		
		/*
		 * Cookies
		 */
		Cookie cookie = new Cookie("store" ,k+"");
		response.addCookie(cookie);
		response.sendRedirect("squaring");
		
		
		
	}

}
