package com.accolite.au.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoHttpServlet extends HttpServlet {

	private static AtomicInteger counter = new AtomicInteger(0);
	private  AtomicInteger cunt = new AtomicInteger(0);

	public EchoHttpServlet() {
		cunt.set(10);
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("EchoHttpServlet # init # Invoked");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("");
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoHttpServlet # doGet # Invoked: Current Thread:: " + Thread.currentThread()
				+ " # thread counter :: " + counter.incrementAndGet());
		System.out.println("************ count************  "+cunt.getAndIncrement());
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		req.setAttribute("numbers", number);
		System.out.println("EchoHttpServlet # doGet # Finished :: "+ req.getServletContext().getInitParameter("url"));
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
