package com.techlabs.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PasswordController() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true); 

        String username = (session != null) ? (String) session.getAttribute("username") : null;
        String password = request.getParameter("password");

        response.setContentType("text/html");
        response.getWriter().println("<p>Session ID: " + (session != null ? session.getId() : "No session") + "</p>");
        response.getWriter().print("Username: " + (username));
        response.getWriter().println("<br>Password: " + (password));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}



//response.getWriter().println("<p>Session Creation Time: " + (session != null ? new java.util.Date(session.getCreationTime()) : "No session") + "</p>");
//response.getWriter().println("<p>Session Last Accessed Time: " + (session != null ? new java.util.Date(session.getLastAccessedTime()) : "No session") + "</p>");
