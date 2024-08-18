package com.techlabs.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.data.UserDbUtil;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDbUtil userDbUtil;

    public LoginController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        userDbUtil = new UserDbUtil();
        userDbUtil.connectToDb();

        if (userDbUtil.validateCredentials(username, password)) {
            request.setAttribute("username", username);
            dispatcher = request.getRequestDispatcher("/LoginSuccess.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("/LoginFailed.jsp");
        }
        dispatcher.forward(request, response);

        userDbUtil.close(); // Close the connection after use
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
