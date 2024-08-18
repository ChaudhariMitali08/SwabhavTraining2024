 
 
import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
 
@WebServlet("/LoginController1") 
public class LoginController1 extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
        
    /** 
     * @see HttpServlet#HttpServlet() 
     */ 
    public LoginController1() { 
        super(); 
        // TODO Auto-generated constructor stub 
    } 
 
 /** 
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
   
//  response.setContentType("text/html"); 
//  String username = request.getParameter("username"); 
//  PrintWriter writer = response.getWriter(); 
//  writer.print("<form action='PasswordController' method='get'>" 
//          + "Password:<input type='password' name='password'/>" 
//          + " <input type='submit' name='ok' value='ok'/>" 
//          + "</form>"); 
//   
 } 
 
 /** 
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
  doGet(request, response); 
 } 
 
}