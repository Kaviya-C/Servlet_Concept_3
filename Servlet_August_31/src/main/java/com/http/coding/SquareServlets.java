package com.http.coding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlets  extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws IOException
	{
		

		int store =0;
		Cookie[] arrayCookie =req.getCookies();
		
		for(Cookie c : arrayCookie)
		{
			if(c.getName().equals("store"))
			{
				store = Integer.parseInt(c.getValue());
				
			}
		}
		
		store  *= store;
		PrintWriter out = res.getWriter();
		out.println(store);

//		int getAdded = (int)req.getAttribute("added");
//		getAdded *= getAdded;
//		PrintWriter out = res.getWriter();
//		out.println("Square of two values : "+getAdded);

//		HttpSession session = req.getSession();
//
//		int squareValue = (int) session.getAttribute("k");
//
//		squareValue *= squareValue;
//
//		PrintWriter out = res.getWriter();
//		out.println("Square of two number is : " + squareValue);
	
	
	}

}
