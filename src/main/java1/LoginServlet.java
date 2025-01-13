import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")  // Ensure the servlet is correctly mapped
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve email and password from request
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if email or password is empty
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            response.sendRedirect("login.jsp?error=Please fill in both fields");
            return;
        }

        // Validate credentials (replace with real validation logic, e.g., database check)
        if (isValidUser(email, password)) {
            // Store user info in session
            HttpSession session = request.getSession(true);  // 'true' creates session if none exists
            session.setAttribute("userEmail", email);

            // Redirect to user dashboard
            response.sendRedirect("user-dashboard.jsp");
        } else {
            // Redirect to login page with error message
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }

    /**
     * Validates user credentials.
     * Replace this stub with actual database validation or authentication logic.
     */
    private boolean isValidUser(String email, String password) {
        // Example static validation. Replace with database queries.
        return "admin@example.com".equals(email) && "admin".equals(password);
    }
}
