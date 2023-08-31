package com.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException
	{
		PrintWriter out = res.getWriter();
		
		out.println("Hi");
	
	
		/*
		 * ServletContext and ServletConfig are interface
		 * 
		 * getServletContext --- httpservlet extends generic servlet
		 * 
		 * generic servlet there is a method called getServletContext() method
		 * 
		 * 
		 */
		
		ServletContext ctx = getServletContext();
		
		String strName = ctx.getInitParameter("name");
		out.println("Hii "+strName);	
		String strPhone = ctx.getInitParameter("phone");
		out.println("Her contact Brand:  "+strPhone);
		
		ServletConfig config = getServletConfig();
		String newName = config.getInitParameter("name");
		out.println(newName);
		
		ServletContext context = getServletContext();
		String another = context.getInitParameter("name");
		out.println(another);
		
		
		
		
		
		
		
		
	
	
	}

}
