package Phase_2_Practice_Project_Part_1;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;	
@SuppressWarnings("serial")
@WebServlet(name = "EmailValidationServlet", urlPatterns = "/validateEmail")
public class EmailValidationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the email parameter from the request
        String email = request.getParameter("email");

        // Validate the email
        boolean isValid = validateEmail(email);

        // Set the response content type
        response.setContentType("text/plain");

        // Write the validation result to the response
        response.getWriter().write(String.valueOf(isValid));
    }

    private boolean validateEmail(String email) {
        // Email regex pattern
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);

        // Match the given email with the pattern
        Matcher matcher = pattern.matcher(email);

        // Return true if the email matches the pattern, false otherwise
        return matcher.matches();
    }
}
