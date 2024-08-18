package com.techlabs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PasswordController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String username = null;

		// Retrieve username from cookies
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("username".equals(cookie.getName())) {
					username = cookie.getValue();
					break;
				}
			}
		}

		String password = request.getParameter("password");

		response.setContentType("text/html");
		response.getWriter().print("Username: " + (username != null ? username : "Not found"));
		response.getWriter().print("<br>Password: " + (password != null ? password : "Not provided"));
	}
}
