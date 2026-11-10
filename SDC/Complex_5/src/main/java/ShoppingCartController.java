
package week7;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ShoppingCartController")
public class ShoppingCartController extends HttpServlet {

    // Opens login page when servlet URL is accessed directly
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.sendRedirect("login.html");
    }

    // Checks login details
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/week7",
                "root",
                "Pranav@2007"
            );

            // Check username and password
            String sql = "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h2>" + username +
                            ": Welcome to Home Page</h2>");
                out.println("<h3>Login Successful</h3>");
            } else {
                out.println("<h2>Please enter correct Username or Password</h2>");
                out.println("<h3>Login Failed</h3>");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}
