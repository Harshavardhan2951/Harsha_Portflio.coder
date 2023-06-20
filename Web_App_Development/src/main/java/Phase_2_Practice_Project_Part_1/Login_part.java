package Phase_2_Practice_Project_Part_1;

import java.io.IOException;
import java.io.PrintWriter;	
import jakarta.servlet.RequestDispatcher;	
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Login")	
public class Login_part extends HttpServlet {
private static final long serialVersionUID = 1L;
public Login_part() {
super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws
ServletException, IOException {
String uname=request.getParameter("txtUname");
String pword=request.getParameter("txtPassword");
PrintWriter out=response.getWriter();
if(uname.equalsIgnoreCase("Harshitha") && pword.equals("Harshitha@123")){
out.println("You are Welcomed");
}
else
out.println("Invalid Username or Password");
}
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws
ServletException, IOException {
String uname=request.getParameter("txtUname");
String pword=request.getParameter("txtPassword");
PrintWriter out=response.getWriter();
RequestDispatcher rd;
if(uname.equalsIgnoreCase("Harshitha") && pword.equals("Harshitha@123")){
HttpSession session=request.getSession(true);
session.setAttribute("username",uname);
out.println("You are Welcomed");
rd=request.getRequestDispatcher("Welcome");
rd.forward(request, response);}
else {
out.println("Invalid Username or Password");
rd=request.getRequestDispatcher("<h1>Userlogin.html</h1>");
rd.include(request, response);
}}}