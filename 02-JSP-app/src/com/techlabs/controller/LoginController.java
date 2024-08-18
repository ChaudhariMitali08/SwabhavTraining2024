package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");

		// Create a cookie for the username
		Cookie usernameCookie = new Cookie("username", username);
		response.addCookie(usernameCookie);

		PrintWriter writer = response.getWriter();
		writer.print(
				"<form action='PasswordController' method='post'>" +
				"Password:<input type='password' name='password'/>" +
				" <input type='submit' name='ok' value='ok'/>" +
				"</form>");
	}
}
