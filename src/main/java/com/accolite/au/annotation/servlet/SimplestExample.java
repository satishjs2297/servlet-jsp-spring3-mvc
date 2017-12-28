package com.accolite.au.annotation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simplestexample")
public class SimplestExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

/*        request.newPushBuilder()
                .path("resources/images/coffee-cup.jpg")
                .push();
*/
        getServletContext().getRequestDispatcher("/coffee-cup.jsp").forward(request, response);

    }
}