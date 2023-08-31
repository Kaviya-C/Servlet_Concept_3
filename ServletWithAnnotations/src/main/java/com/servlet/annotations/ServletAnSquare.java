package com.servlet.annotations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/squareroot")
public class ServletAnSquare extends HttpServlet
{
	public void doGet(HttpServletRequest req , HttpServletResponse res)
	throws ServletException ,IOException
	{
		
	    int adds =0;
		
		Cookie[] array = req.getCookies();
		
		for(Cookie c: array)
		{
			if(c.getName().equals("add"))
			{
				adds = Integer.parseInt(c.getValue());
			}
		}
		
		adds = adds * adds;
		System.out.println(adds);
		PrintWriter out = res.getWriter();
		out.println("Square of given two number: "+adds);
		System.out.println("finally: "+adds);
	}

}
