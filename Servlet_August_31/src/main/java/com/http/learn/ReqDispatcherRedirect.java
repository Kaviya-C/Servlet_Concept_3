package com.http.learn;

public class ReqDispatcherRedirect 
{
	/*
	 * Request Dispatcher
	 * 
	 * RequestDispatcher re = request.getRequestDispatcher();
	 * re.forward(request,response);
	 * both request are in same object
	 * simply need request object
	 * 
	 * servlet -1  call servlet - 2
	 * RequestDispatcher rd call this
	 * REQUEST DISPATCHER IS APPLICABLE TO NAVIGATE TO REDIERECT
	 * INTO THE SAME BROWSER
	 * ITS NOT APPLICABLE WHEN WE NAVIGATE TO THE DIFFERENT BROWSER
	 * 
	 * 
	 * we have to use sendRedirect() method  this will helpful to 
	 * navigate to the client of different browser also
	 * its work properly
	 * s1 --> call --> s2
	 * s1 is request  -1
	 * s2 is request  -2
	 *  
	 * here  we are in different object 
	 * We have to use session object here to do sendDirect() method
	 * 
	 * 
	 * 
	 * 
	 * sendRedirect()
	 */

}
