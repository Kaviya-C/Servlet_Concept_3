package com.servlet.annotations;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class ServletAnAddition  extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)
	throws IOException
	{
		int num1 = Integer.parseInt(request.getParameter("no1")) ;
				
		int num2 = Integer.parseInt(request.getParameter("no2"));
		System.out.println(num1 +" "+ num2);
		int addition = num1 + num2 ;
		
		
		Cookie cook = new Cookie("adds",addition+"");
		response.addCookie(cook);
		
		response.sendRedirect("squareroot");
		
	}

}
