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
import javax.servlet.http.HttpSession;

@SuppressWarnings("deprecation")
public class EchoSTMServlet extends HttpServlet implements SingleThreadModel {
	
	private static AtomicInteger counter = new AtomicInteger(0);
	private  AtomicInteger cunt = new AtomicInteger(0);
	
	public EchoSTMServlet() {
		System.out.println("*** EchoSTMServlet ***");
		cunt.set(10);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EchoSTMServlet #singlethreadModel #doGet # Invoked: Current Thread:: " + Thread.currentThread()
		+ " # thread counter :: " + counter.incrementAndGet());
		System.out.println("************ count************ :: "+cunt.getAndIncrement());
		{
			HttpSession session = req.getSession(false);
			
		}
		try {			
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("EchoSTMServlet# singlethreadModel # end!!");
	}
	

}
