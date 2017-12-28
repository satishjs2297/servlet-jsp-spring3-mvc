/**
 * 
 */
package com.accolite.au.servlet;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Accolite
 *
 */
public class EchoHttpServlet extends HttpServlet {

	private static AtomicInteger counter = new AtomicInteger(0);

	@Override
	public void init() throws ServletException {
		System.out.println("EchoHttpServlet # init # Invoked");
		super.init();
	}
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoHttpServlet # doGet # Invoked: Current Thread:: " + Thread.currentThread()
				+ " # thread counter :: " + counter.incrementAndGet());
		// resp.getWriter().append("<html><h2>EchoGenericServlet # doGet method
		// ignoved...</h2></html>");

		// performance check
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("EchoHttpServlet # doGet # Finished");
		req.getRequestDispatcher("WEB-INF/views/jsp/echo.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoGenericServlet # doPost # Invoked");
		resp.getWriter().append("<html><h2>EchoGenericServlet # doPost method ignoved...</h2></html>");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoGenericServlet # doDelete # Invoked");
		resp.getWriter().append("<html><h2>EchoGenericServlet # doDelete method ignoved...</h2></html>");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoGenericServlet # doPut # Invoked");
		resp.getWriter().append("<html><h2>EchoGenericServlet # doPut method ignoved...</h2></html>");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoGenericServlet # doHead # Invoked");
		resp.getWriter().append("<html><h2>EchoGenericServlet # doHead method ignoved...</h2></html>");
	}

	@Override
	public void destroy() {
		System.out.println("EchoHttpServlet # destroy # Invoked");
		super.destroy();
	}
}
