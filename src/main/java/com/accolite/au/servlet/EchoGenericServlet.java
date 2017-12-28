/**
 * 
 */
package com.accolite.au.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Accolite
 *
 */
public class EchoGenericServlet extends GenericServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("EchoGenericServlet # init # Invoked");
		super.init();
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("EchoGenericServlet # service # Invoked");
		boolean isHttpReq = request instanceof HttpServletRequest;
		System.out.println("isHttpReq ::: "+isHttpReq);
		//response.getWriter().append("<html><h2>EchoGenericServlet Serivice method ignoved...</h2></html>");
		request.getRequestDispatcher("WEB-INF/views/jsp/2.jsp").forward(request, response);;
	}

	
	@Override
	public void destroy() {
		System.out.println("EchoGenericServlet # destroy # Invoked");
		super.destroy();
	}
}
