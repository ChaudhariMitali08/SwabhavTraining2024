package com.techlab.controller; 
 
import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
@WebServlet("/FirstServlet") 
public class MyServlet extends HttpServlet { 
 
 public MyServlet() { 
  super(); 
 } 
 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   throws ServletException, IOException { 
  PrintWriter writer = response.getWriter(); 
  int number1 = Integer.parseInt(request.getParameter("number1")); 
  int number2 = Integer.parseInt(request.getParameter("number2")); 
  int result = number1 + number2; 
  writer.print("Addition is:<b>" + result + "<\b>"); 
 } 
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
   throws ServletException, IOException { 
  doGet(request, response); 
 } 
 
}