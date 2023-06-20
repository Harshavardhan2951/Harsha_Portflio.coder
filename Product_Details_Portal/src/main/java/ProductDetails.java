import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SERVLET")
public class ProductDetails extends HttpServlet
{
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException
 {
 
 String un = request.getParameter("ProductName");
 String pa = request.getParameter("Price");
 String ge = request.getParameter("Description");
 
 response.setContentType("text/html");
 PrintWriter pw=response.getWriter();
 pw.write("<h2> Following data received sucessfully.. <h2> <br>");
 
 pw.write("<h3> ProductName : "+ un +" </h3>");
 pw.write("<h3> Price : "+ pa +" </h3>");
 pw.write("<h3> Description : "+ ge +" </h3>");
 
 
 pw.write("</h3>");
 }
}