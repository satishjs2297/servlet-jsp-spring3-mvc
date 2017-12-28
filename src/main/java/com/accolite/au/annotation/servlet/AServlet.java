package com.accolite.au.annotation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/a")
public class AServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("AServlet doGet invoked.");
		String reqType = req.getParameter("reqType");
		if("dispatcher".equals(reqType)) {
			System.out.println("Invoke BServlet doGet");
			req.getRequestDispatcher("/b").forward(req, resp);
		} else {
			resp.sendRedirect(req.getContextPath()+"/c");
		}
	}
	
}
