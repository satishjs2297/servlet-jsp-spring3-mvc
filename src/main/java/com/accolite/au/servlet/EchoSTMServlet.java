package com.accolite.au.servlet;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("deprecation")
public class EchoSTMServlet extends HttpServlet implements SingleThreadModel {
	
	private static AtomicInteger counter = new AtomicInteger(0);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoSTMServlet #singlethreadModel #doGet # Invoked: Current Thread:: " + Thread.currentThread()
		+ " # thread counter :: " + counter.incrementAndGet());
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("EchoSTMServlet# singlethreadModel # end!!");
	}
	

}
