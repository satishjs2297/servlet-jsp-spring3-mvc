package com.accolite.au.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SyncTokenFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("SyncTokenFilter # init # Invoked");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("SyncTokenFilter # doFilter # Invoked");
		
		if(new Boolean(request.getParameter("isNotAuthenticated"))) {			
			request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
		} else {
			//see browser Cookies
			HttpSession session =  ((HttpServletRequest)request).getSession(new Boolean(request.getParameter("setSession")));
			System.out.println("session :: "+ session);
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		System.out.println("SyncTokenFilter # destroy # Invoked");
	}

}
