package Project;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve username and password from the login form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate the credentials (e.g., check against a database)
        boolean isValidUser = validateUser(username, password);

        if (isValidUser) {
            // Redirect to a success page
            response.sendRedirect("success.html");
        } else {
            // Redirect to an error page
            response.sendRedirect("error.html");
        }
    }

    private boolean validateUser(String username, String password) {
        // Perform your validation logic here
        // You can check against a database, compare with hardcoded values, etc.
        // Return true if the credentials are valid, false otherwise

        // Example validation logic (for demonstration purposes only)
        return username.equals("admin") && password.equals("password");
    }
}
